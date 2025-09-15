package insel.store.model.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

/**
 * @author Oleg Mordkovich
 * {@code @date} 15.09.2025
 */
@Configuration
@EnableWebSecurity
@EnableMethodSecurity

public class SecurityConfig {

    @Bean
    public PasswordEncoder encoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http
                // Отключаем защиту CSRF
                .csrf(AbstractHttpConfigurer::disable)
                // Настройка сессий
                // При текущей настройке мы сессии отключили,
                // то есть сервер будет просить логин/пароль при каждом запросе
                .sessionManagement(x -> x
                        .sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                // Включаем базовую авторизацию (при помощи логина и пароля)
                .httpBasic(Customizer.withDefaults())
                // конфигурируем доступ к разному функционалу
                // приложения для разных ролей пользователей
                .authorizeHttpRequests(x -> x
                        .requestMatchers(HttpMethod.GET, "/tours").permitAll()
                        .requestMatchers(HttpMethod.GET, "/tours/{id}").hasAnyRole("USER", "ADMIN")
                        .requestMatchers(HttpMethod.POST, "/tours").hasRole("ADMIN")
                        .anyRequest().authenticated()
                ).build();
    }
}

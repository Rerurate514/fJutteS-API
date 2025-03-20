package com.fjuttes.api

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.web.SecurityFilterChain


@Configuration
@EnableWebSecurity
class SecurityConfig {
    @Bean
    fun securityFilterChain(http: HttpSecurity): SecurityFilterChain {
        http
            .authorizeHttpRequests { authorize ->
                authorize.anyRequest().permitAll() // すべてのリクエストを許可
            }
            .formLogin { form ->
                form.disable() // フォームログインを無効化
            }
            .httpBasic { basic ->
                basic.disable() // HTTP Basic認証を無効化
            }
            .csrf { csrf ->
                csrf.disable() // CSRF保護を無効化
            }
            .cors { cors ->
                cors.disable() // CORS設定を無効化
            }

        return http.build()
    }
}
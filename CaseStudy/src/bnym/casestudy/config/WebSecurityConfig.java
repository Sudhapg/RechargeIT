package bnym.casestudy.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
@ComponentScan("bnym.casestudy")
@EnableGlobalMethodSecurity(prePostEnabled = true)

public class WebSecurityConfig extends WebSecurityConfigurerAdapter  {
	@Autowired
	  private UserDetailsService userDetailsService;
	  
	  @Bean
	  public BCryptPasswordEncoder passwordEncoder() {
	    return new BCryptPasswordEncoder();
	  }
	  
	  @Bean
	  public UserDetailsService userDetailsServiceBean() throws Exception {
	      return super.userDetailsServiceBean();
	  }
	  
	  @Override
	  protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	    auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
	  }

	  @Override
	  protected void configure(HttpSecurity http) throws Exception {
		  http.authorizeRequests().anyRequest().permitAll()
		    .and()
		    .authorizeRequests().antMatchers("/user**").hasRole("USER")
		    .and()
		    .authorizeRequests().antMatchers("/admin**").hasRole("ADMIN")
		    .and()
		    .formLogin().loginPage("/login").loginProcessingUrl("/loginAction").permitAll()
		    .defaultSuccessUrl("/subscribe", true)
		    .and()
		    .logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
		    .and()
		    .csrf().disable();
	  }

}

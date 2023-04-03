package com.example.zuulproxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class ZuulproxyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulproxyApplication.class, args);
	}

	// @RestController
	// public class EndpointDocController {
	// 	private final RequestMappingHandlerMapping handlerMapping;

	// 	public EndpointDocController(@Qualifier("requestMappingHandlerMapping") RequestMappingHandlerMapping handlerMapping) {
	// 		this.handlerMapping = handlerMapping;
	// 	}

	// 	@RequestMapping(value="/endpointdoc", method=RequestMethod.GET)
	// 	public String show(Model model) {
	// 		this.handlerMapping.getHandlerMethods().entrySet().forEach(entry -> {
	// 			System.out.println(entry.getKey() + " " + entry.getValue());
	// 		});
	// 		return "...";
	// 	}
	// }

	// public class DumpFilters extends OncePerRequestFilter {
	// 	@Override
	// 	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response,
	// 			FilterChain filterChain) throws ServletException, IOException {
	// 		if (filterChain instanceof ApplicationFilterChain) {
	// 			ApplicationFilterChain applicationFilterChain = (ApplicationFilterChain) filterChain;
	// 			try {
	// 				Field filters = applicationFilterChain.getClass().getDeclaredField("filters");
	// 				filters.setAccessible(true);
	// 				ApplicationFilterConfig[] filterConfigs = (ApplicationFilterConfig[]) filters.get(applicationFilterChain);
	// 				for (ApplicationFilterConfig applicationFilterConfig : filterConfigs) {
	// 					if (applicationFilterConfig != null) {
	// 						System.out.println("Filter Name: " + applicationFilterConfig.getFilterName() + " FilterClass: " + applicationFilterConfig.getFilterClass());
	// 						if (applicationFilterConfig.getFilterName().equals("springSecurityFilterChain")) {
	// 							try {
	// 								Method getFilter = applicationFilterConfig.getClass().getDeclaredMethod("getFilter");
	// 								getFilter.setAccessible(true);
	// 								DelegatingFilterProxy delegatingFilterProxy = (DelegatingFilterProxy) getFilter.invoke(applicationFilterConfig);

	// 								Field delegate = DelegatingFilterProxy.class.getDeclaredField("delegate");
	// 								delegate.setAccessible(true);
	// 								FilterChainProxy filterChainProxy = (FilterChainProxy) delegate.get(delegatingFilterProxy);
	// 								if (filterChainProxy != null) {
	// 									List<SecurityFilterChain> filterChains = filterChainProxy.getFilterChains();
	// 									for (SecurityFilterChain securityFilterChain : filterChains) {
	// 										DefaultSecurityFilterChain defaultSecurityFilterChain = (DefaultSecurityFilterChain) securityFilterChain;
	// 										System.out.println("\t" + defaultSecurityFilterChain.getRequestMatcher());
	// 										List<Filter> securityFilters = securityFilterChain.getFilters();
	// 										for (Filter securityFilter : securityFilters) {
	// 											System.out.println("\t\t" + securityFilter);
	// 										}
	// 									}
	// 								}
	// 							} catch (NoSuchMethodException | InvocationTargetException e) {
	// 								System.out.println(e.getMessage());
	// 							}
	// 						}
	// 					}
	// 				}
	// 			} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
	// 				System.out.println(e.getMessage());
	// 			}
	// 		}
	// 		// response.setStatus(HttpServletResponse.SC_OK);
	// 		filterChain.doFilter(request, response);
	// 	}
	// }

	// @Bean
	// public FilterRegistrationBean<DumpFilters> userFilter() {
	// 	FilterRegistrationBean<DumpFilters> registrationBean = new FilterRegistrationBean<>();
	// 	registrationBean.setFilter(new DumpFilters());
	// 	// registrationBean.addUrlPatterns("/dumpfilters");
	// 	registrationBean.setOrder(Ordered.HIGHEST_PRECEDENCE);
	// 	return registrationBean;
	// }
}

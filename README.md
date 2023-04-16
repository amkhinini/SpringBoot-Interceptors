
# Interceptors in SpringBoot

In a SpringBoot application you want to do something to the request before your controller handles it or to the response before it's returned back to the client.

## Interceptors types

- General purpose interceptor : runs for all requests
- Single purpose interceptor : runs for a specific controller (and/or) specific URL

## Interceptors configuration

All interceptors configurations are done within a configuration class in SpringBoot.

- The interceptor configuration class should implement ***WebMvcConfigurer***
- The configuration class should override the ***addInterceptors*** method
- Within the addInterceptors method, use **interceptorRegistry** to add a specific interceptor to Spring Context, using the **addInterceptor** method

>
 💡 multiple interceptors could be added to the configuration. 
Spring provides a lot of options to deal with like the ***order*** method to specify the interceptors execution order.
***addPathPatterns*** method to deal with specific URL (single purpose interceptor)


## Interceptors implementation

To implement interceptors, you should :

- Implement the **HandlerInterceptor** class
- Override the **preHandle, postHandle** and **afterCompletion** methods

>
💡 **preHandle**  will be executed before the request reaches then handler (controller) : it returns a boolean; *if false then the interceptor will be the last step of the request handling (controller will not be executed)*
**postHandle**  will be executed after the handler (controller) already served the request
**afterCompletion** will be executed after the reauest **and** the view rendering, in case a view engine is executed

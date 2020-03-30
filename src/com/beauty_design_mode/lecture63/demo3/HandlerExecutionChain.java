//package com.beauty_design_mode.lecture63.demo3;
//
///**
// * spring Interceptor 示例:底层实现见 HandlerExecutionChain
// *
// * @author Alan Yin
// * @date 2020/3/30
// */
//
//public class HandlerExecutionChain {
//    private final Object handler;
//    private HandlerInterceptor[] interceptors;
//
//    public void addInterceptor(HandlerInterceptor interceptor) {
//        initInterceptorList().add(interceptor);
//    }
//
//    boolean applyPreHandle(HttpServletRequest request, HttpServletResponse response) throws Exception {
//        HandlerInterceptor[] interceptors = getInterceptors();
//        if (!ObjectUtils.isEmpty(interceptors)) {
//            for (int i = 0; i < interceptors.length; i++) {
//                HandlerInterceptor interceptor = interceptors[i];
//                if (!interceptor.preHandle(request, response, this.handler)) {
//                    triggerAfterCompletion(request, response, null);
//                    return false;
//                }
//            }
//        }
//        return true;
//    }
//
//    void applyPostHandle(HttpServletRequest request, HttpServletResponse response, ModelAndView mv) throws Exception {
//        HandlerInterceptor[] interceptors = getInterceptors();
//        if (!ObjectUtils.isEmpty(interceptors)) {
//            for (int i = interceptors.length - 1; i >= 0; i--) {
//                HandlerInterceptor interceptor = interceptors[i];
//                interceptor.postHandle(request, response, this.handler, mv);
//            }
//        }
//    }
//
//    void triggerAfterCompletion(HttpServletRequest request, HttpServletResponse response, Exception ex)
//            throws Exception {
//        HandlerInterceptor[] interceptors = getInterceptors();
//        if (!ObjectUtils.isEmpty(interceptors)) {
//            for (int i = this.interceptorIndex; i >= 0; i--) {
//                HandlerInterceptor interceptor = interceptors[i];
//                try {
//                    interceptor.afterCompletion(request, response, this.handler, ex);
//                } catch (Throwable ex2) {
//                    logger.error("HandlerInterceptor.afterCompletion threw exception", ex2);
//                }
//            }
//        }
//    }
//}
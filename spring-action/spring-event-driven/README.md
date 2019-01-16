# 事件驱动笔记
# jdk事件驱动
## 三要素
* EventObject 事件
* EventListener (java.util.EventListener)该接口为标记接口，所有事件监听器都需要实现该接口，事件监听器注册在事件源上，
当事件源的状态或属性发生改变时，调用相应监听器内的回调方法。
* Source 事件源，不需要实现或继承任何接口或类，是事件最初发生的地方。因为事件监听器需要注册在事件源上，
所以事件源内需要有存放事件监听器的容器
# Spring事件驱动
* Source 事件源
* ApplicationEvent 事件
* ApplicationListener 事件监听器

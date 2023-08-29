/*
 * Copyright 2002-2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.core.env;

/**
 * Interface indicating a component that contains and exposes an {@link Environment} reference.
 * 接口，指示包含并公开f@link环境)引用的组件。
 *
 * <p>All Spring application contexts are EnvironmentCapable, and the interface is used primarily
 * for performing {@code instanceof} checks in framework methods that accept BeanFactory
 * instances that may or may not actually be ApplicationContext instances in order to interact
 * with the environment if indeed it is available.
 * <p>所有Spring应用程序上下文都是可环境的，该接口主要用于在框架方法中执行{@code instanceof)检查，
 * 这些方法接受BeanFactory实例，这些实例可能实际上是ApplicationContext实例，也可能不是，以便在环境可用的情况下与环境交互。
 *
 * <p>As mentioned, {@link org.springframework.context.ApplicationContext ApplicationContext}
 * extends EnvironmentCapable, and thus exposes a {@link #getEnvironment()} method; however,
 * {@link org.springframework.context.ConfigurableApplicationContext ConfigurableApplicationContext}
 * redefines {@link org.springframework.context.ConfigurableApplicationContext#getEnvironment
 * getEnvironment()} and narrows the signature to return a {@link ConfigurableEnvironment}.
 * The effect is that an Environment object is 'read-only' until it is being accessed from
 * a ConfigurableApplicationContext, at which point it too may be configured.
 *
 * <p>如上所述，{@link org.springframework.context.ApplicationContext ApplicationContext}
 * 扩展了EnvironmentCapable，从而公开了一个{@link # getenenvironment()}方法;
 * 但是，{@link org.springframework.context.ConfigurableApplicationContext ConfigurableApplicationContext}
 * 重新定义了{@link org.springframework.context.ConfigurableApplicationContext#getEnvironment getenvirenvironment()}
 * 并缩小签名以返回{@link ConfigurableEnvironment)。
 * 其效果是，在从ConfigurableApplicationContext访问环境对象之前，环境对象是“只读”的，此时它也可以被配置。
 *
 * @author Chris Beams
 * @since 3.1
 * @see Environment
 * @see ConfigurableEnvironment
 * @see org.springframework.context.ConfigurableApplicationContext#getEnvironment()
 */
public interface EnvironmentCapable {

	/**
	 * Return the {@link Environment} associated with this component.
	 */
	Environment getEnvironment();

}

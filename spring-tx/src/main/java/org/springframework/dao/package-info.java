/**
 * Exception hierarchy enabling sophisticated error handling independent
 * of the data access approach in use. For example, when DAOs and data
 * access frameworks use the exceptions in this package (and custom
 * subclasses), calling code can detect and handle common problems such
 * as deadlocks without being tied to a particular data access strategy,
 * such as JDBC.
 *
 * <p>All these exceptions are unchecked, meaning that calling code can
 * leave them uncaught and treat all data access exceptions as fatal.
 *
 * <p>The classes in this package are discussed in Chapter 9 of
 * <a href="https://www.amazon.com/exec/obidos/tg/detail/-/0764543857/">Expert One-On-One J2EE Design and Development</a>
 * by Rod Johnson (Wrox, 2002).
 * 异常层次结构支持独立于所使用的数据访问方法的复杂错误处理。
 * 例如，当dao和数据访问框架使用此包(和自定义子类)中的异常时，调用代码可以检测和处理死锁等常见问题，而无需绑定到特定的数据访问策略(如JDBC)。
 * <p>所有这些异常都是未检查的，这意味着调用代码可以不捕获它们，并将所有数据访问异常视为致命的。
 * 的第9章讨论了这个包中的类<a href="https://www.amazon.com/exec/obidos/tg/detail/-/0764543857/">
 *     Expert One-0n-0ne J2EE设计与开发</a> / Rod Johnson著(Wrox, 2002)。
 */
@NonNullApi
@NonNullFields
package org.springframework.dao;

import org.springframework.lang.NonNullApi;
import org.springframework.lang.NonNullFields;

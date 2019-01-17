/**
 * <html>
 * <body>
 *  <P> Copyright 1994 JsonInternational</p>
 *  <p> All rights reserved.</p>
 *  <p> Created on 19941115</p>
 *  <p> Created by Jason</p>
 *  </body>
 * </html>
 */
package com.phdua.manager.designpattern.pattern.structure.bridge;

import com.phdua.manager.designpattern.pattern.structure.bridge.abs.Implementor;

/**
* @Package：com.phdua.manager.designpattern.pattern.structure.bridge
* @ClassName：ConcreteImplementor   
* @Description：   <p> 桥接模式  --  具体实现类</p>
* @Author： -  
* @CreatTime：2017年10月26日 下午5:59:37   
* @Modify By：   
* @ModifyTime：  
* @Modify marker：   
* @version    V1.0
 */
public class ConcreteImplementor implements Implementor {
	
    @Override
    public void doSomethingA() {
        System.out.println("bridge do something A");
    }

    @Override
    public void doSomethingB() {
        System.out.println("bridge do something B");
    }
}

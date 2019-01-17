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
package com.phdua.manager.designpattern.pattern.action.state.allState;

import com.phdua.manager.designpattern.pattern.action.state.absState.Context;
import com.phdua.manager.designpattern.pattern.action.state.absState.State;

/**
* @Package：com.phdua.manager.designpattern.pattern.action.state.allState
* @ClassName：Close   
* @Description：   <p> 状态模式   -   关闭状态</p>
* @Author： -  
* @CreatTime：2017年10月26日 下午4:55:55   
* @Modify By：   
* @ModifyTime：  
* @Modify marker：   
* @version    V1.0
 */
public class Close extends State {


	/**
	 * context - state的context 
	 */
    @Override
    public void open() {
        //状态修改
        context.setNowState(Context.open); //设置为open状态
        //委托执行 
        context.getNowState().open();
    }

    @Override
    public void close() {
       System.out.println("电梯门关闭");
    }

    //运行
    @Override
    public void run() {
        //状态修改
        context.setNowState(Context.run);
        //委托执行
        context.getNowState().run();
    }

    //停止
    @Override
    public void stop() {
        //状态修改
        context.setNowState(Context.stop);
        //委托执行
        context.getNowState().stop();

    }
}

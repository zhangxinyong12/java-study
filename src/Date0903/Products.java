package Date0903;

import java.util.Date;

// 一个类只能 extends一个父类 但是可以implements 多个接口同时要定义方法
public class Products implements ExpireDateMerchandise,VirtualMerchandise{
    @Override
    public boolean notExpireInDays(int days) {
        return false;
    }
    // @ 注解
    // @Override 代表次方法覆盖了父类的方法/实现了继承接口的方法，否则会报错
    @Override
    public Date getProducedDate() {
        return null;
    }

    @Override
    public Date getExpireDate() {
        return new Date();
    }
}

package Date0903;

import java.util.Date;

public interface ExpireDateMerchandise {
    // 接口里面的方法都是 public abstract 修饰，方法有名字 参数 返回值 没有方法体 分号结束
    // 接口无法被实例化 不饿能new
    /**
     * @param days 截止到当前，保质期超过了这么多天
     * @return
     */
    boolean notExpireInDays(int days);

    /**
     *
     * @return 商品生产日期
     */
    Date getProducedDate();

    /**
     *
     * @return 商品保质日期
     */
    Date getExpireDate();
}

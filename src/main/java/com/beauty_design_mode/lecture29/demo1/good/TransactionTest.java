package com.beauty_design_mode.lecture29.demo1.good;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.beauty_design_mode.lecture29.demo1.support.STATUS;

/**
 * 代码可测试性演示
 *
 * @author Alan Yin
 * @date 2021/8/30
 */
public class TransactionTest {

  /** 1.使用 Mock 对象来替代真正的RPC服务 演示 WalletRpcService */
  public void testExecute() {
    Long buyerId = 123L;
    Long sellerId = 234L;
    Long productId = 345L;
    Long orderId = 456L;

    TransactionV1 transactionV1 = new TransactionV1(null, buyerId, sellerId, productId, orderId);
    // 使用mock对象来替代真正的RPC服务
    transactionV1.setWalletRpcService(new MockWalletRpcServiceOne());
    boolean executedResult = transactionV1.execute();
    assertTrue(executedResult);
    assertEquals(STATUS.EXECUTED, transactionV1.getStatus());
  }

  /** 2.演示测试代码中依赖的单例对象 */
  public void testExecute2() {
    Long buyerId = 123L;
    Long sellerId = 234L;
    Long productId = 345L;
    Long orderId = 456L;

    TransactionLock mockLock =
        new TransactionLock() {
          @Override
          public boolean lock(String id) {
            return true;
          }

          @Override
          public void unlock(String id) {}
        };

    TransactionV2 transaction = new TransactionV2(null, buyerId, sellerId, productId, orderId);
    transaction.setWalletRpcService(new MockWalletRpcServiceOne());
    transaction.setLock(mockLock);
    boolean executedResult = transaction.execute();
    assertTrue(executedResult);
    assertEquals(STATUS.EXECUTED, transaction.getStatus());
  }

  public void testExecute_with_transactionIsExpired() {
    Long buyerId = 123L;
    Long sellerId = 234L;
    Long productId = 345L;
    Long orderId = 456L;
    TransactionV3 transaction =
        new TransactionV3(null, buyerId, sellerId, productId, orderId) {
          @Override
          protected boolean isExpired() {
            // 直接将其设置成我们测试想要的返回结果
            return true;
          }
        };
    boolean actualResult = transaction.execute();
    assertFalse(actualResult);
    assertEquals(STATUS.EXPIRED, transaction.getStatus());
  }
}

package Thread.lock;

import Thread.lock.bean.Bank;

/**
 * 模拟读写锁
 * 
 * @author panqian
 * @date 2016年12月21日 下午7:05:28
 */
public class ReadLockRunnable_1 implements Runnable {

	Bank bank;

	public ReadLockRunnable_1(Bank bank) {
		this.bank = bank;
	}

	@Override
	public void run() {
		while (true) {
			bank.topUp();
		}
	}

}
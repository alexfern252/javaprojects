package com.haripadisetti.corejava;


import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumerProblem {

	public static void main(String[] args) throws InterruptedException {

		final Buffer buffer = new Buffer(2);

		System.out.println(" Producer Consumer Problem");

		Thread producerThread = new Thread() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Producer Thread");
				try {

					int value = 0;
					while (true) {
						buffer.add(value);
						System.out.println("Produced " + value);
						value++;

						Thread.sleep(1000);
					}

				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};

		Thread consumerThread = new Thread() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("consumerThread");
				try {

					while (true) {

						int value = buffer.poll();
						System.out.println("Consume " + value);
						Thread.sleep(1000);
					}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};

		producerThread.start();
		consumerThread.start();

		producerThread.join();
		consumerThread.join();

	}

	static class Buffer {

		private Queue<Integer> list;
		private int size;

		Buffer(int size) {
			this.list = new LinkedList();
			this.size = size;
		}

		public void add(int value) throws InterruptedException {

			synchronized (this) {
				while (list.size() >= size) {
					wait();
				}
				list.add(value);
				notify();
			}

		}

		public int poll() throws InterruptedException {

			synchronized (this) {

				while (list.size() == 0) {

					wait();
				}
				int value = list.poll();
				notify();
				return value;
			}

		}

	}
}

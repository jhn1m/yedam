package com.yedam.java.ch04.lifofifo;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		Queue<Message> messageQueue = new LinkedList<Message>();

		// Stack 클래스의 push()
		messageQueue.offer(new Message("sendMail", "홍길동"));
		messageQueue.offer(new Message("sendSMS", "동길홍"));
		messageQueue.offer(new Message("sendkakaotalk", "김김김"));

		while (!messageQueue.isEmpty()) {
			// Stack 클래스의 pop()
			Message message = messageQueue.poll();
			switch (message.command) {
			case "sendMail":
				System.out.println(message.to + "님에게 메일을 보냈습니다.");
				break;
			case "sendSMS":
				System.out.println(message.to + "님에게 SMS을 보냈습니다.");
				break;
			case "sendkakaotalk":
				System.out.println(message.to + "님에게 kakaotalk을 보냈습니다.");
				break;
			}
		}

	}

}

package com.jhonnatha.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.jhonnatha.cursomc.domain.Pedido;

public interface EmailService {
	
	void sendOrderConfirmationEmail(Pedido obj);

	void sendEmail(SimpleMailMessage msg);

}

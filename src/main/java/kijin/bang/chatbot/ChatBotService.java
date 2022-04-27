package kijin.bang.chatbot;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface ChatBotService {
	public String download(HttpServletRequest request, HttpServletResponse response);

}

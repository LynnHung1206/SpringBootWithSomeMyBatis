package tw.idv.lynn.web.member.controller;

import javax.servlet.http.HttpServlet;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.support.SessionStatus;

@RestController
@RequestMapping("/member/logout")
public class LogoutController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@GetMapping
	public void logout(SessionStatus sessionStatus) {
		sessionStatus.setComplete();
	}
//	sessionStatus可以用來關閉HTTP session
}

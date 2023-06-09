package com.demo.rest;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;

//trường hợp người dùng gửi request mà không có quyền

public class CustomAccessDeniedHandler implements AccessDeniedHandler {
  @Override
  public void handle(HttpServletRequest request, HttpServletResponse response, AccessDeniedException exc)
      throws IOException, ServletException {
    response.setStatus(HttpServletResponse.SC_FORBIDDEN);
    response.getWriter().write("Access Denied!");
  }
}

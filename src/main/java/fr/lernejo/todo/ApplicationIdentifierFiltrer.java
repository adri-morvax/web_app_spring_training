package fr.lernejo.todo;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.UUID;

@Component
public class ApplicationIdentifierFiltrer implements Filter {
    public String uuid = UUID.randomUUID().toString();

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        HttpServletResponse res = (HttpServletResponse) response;
        res.setHeader("InstanceId",uuid);

        chain.doFilter(request, response);

    }
}

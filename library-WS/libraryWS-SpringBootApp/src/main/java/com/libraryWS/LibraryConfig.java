package com.libraryWS;

import org.springframework.context.annotation.Configuration;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;

@EnableWs
@Configuration
public class LibraryConfig extends WsConfigurerAdapter {
}

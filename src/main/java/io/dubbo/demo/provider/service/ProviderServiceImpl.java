package io.dubbo.demo.provider.service;

import org.springframework.stereotype.Service;

@Service("providerService")
public class ProviderServiceImpl implements ProviderService{

	@Override
	public String hello(String name) {
		return "dubbo:hello "+name;
	}

}

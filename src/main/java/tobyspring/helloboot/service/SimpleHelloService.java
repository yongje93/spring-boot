package tobyspring.helloboot.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tobyspring.helloboot.repository.HelloRepository;

@Service
@RequiredArgsConstructor
public class SimpleHelloService implements HelloService {
    private final HelloRepository helloRepository;

    @Override
    public String sayHello(String name) {
        this.helloRepository.increaseCount(name);

        return "Hello " + name;
    }

    @Override
    public int countOf(String name) {
        return helloRepository.countOf(name);
    }

}

package kr.ac.jejunu;

//의존성 전문적 관리 - di_dependency injection - spring > 클라이언트 전달

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // Bean 을 정의해주는것
public class DaoFactory {
    @Bean // spring 이 new 해주는 object instance
    public UserDao userDao() {
        return new UserDao(connectionMaker());
    }

    @Bean
    public ConnectionMaker connectionMaker() {
        return new JejuConnectionMaker();
    }
}

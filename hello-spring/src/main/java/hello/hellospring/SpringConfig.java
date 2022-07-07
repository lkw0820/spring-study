package hello.hellospring;

import hello.hellospring.aop.TimeTraceAop;
import hello.hellospring.repository.*;
import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//직접 스프링 빈 등록
@Configuration
public class SpringConfig {

    //jdbc
    /*private DataSource dataSource;

    @Autowired
    public SpringConfig(DataSource dataSource){
        this.dataSource = dataSource;
    }*/

    //jpa
    /*private EntityManager em;

    @Autowired
    public SpringConfig(EntityManager em){
        this.em = em;
    }*/

    //spring jpa
    private final MemberRepository memberRepository;
    @Autowired
    public SpringConfig(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }


    /*@Bean
    public MemberService memberService(){
        return new MemberService(memberRepository());
    }
*/
    //spring jpa
    @Bean
    public MemberService memberService(){
        return new MemberService(memberRepository);
    }
    /*@Bean
    public MemberRepository memberRepository(){*/
        /*return new MemoryMemberRepository();*/
        //return new JdbcMemberRepository(dataSource);
        //return new JdbcTemplateMemberRepository(dataSource);
        //return new JpaMemberRepository(em);

    //}


}

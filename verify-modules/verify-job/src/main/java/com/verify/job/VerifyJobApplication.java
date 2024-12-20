package com.verify.job;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.verify.common.security.annotation.EnableCustomConfig;
import com.verify.common.security.annotation.EnableRyFeignClients;

/**
 * 定时任务
 * 
 * @author verify
 */
@EnableCustomConfig
@EnableRyFeignClients   
@SpringBootApplication
public class VerifyJobApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(VerifyJobApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  定时任务模块启动成功   ლ(´ڡ`ლ)ﾞ  \n" +
                " .-------.       ____     __        \n" +
                " |  _ _   \\      \\   \\   /  /    \n" +
                " | ( ' )  |       \\  _. /  '       \n" +
                " |(_ o _) /        _( )_ .'         \n" +
                " | (_,_).' __  ___(_ o _)'          \n" +
                " |  |\\ \\  |  ||   |(_,_)'         \n" +
                " |  | \\ `'   /|   `-'  /           \n" +
                " |  |  \\    /  \\      /           \n" +
                " ''-'   `'-'    `-..-'              ");
    }
}

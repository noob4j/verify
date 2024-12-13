package com.verify.gen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.verify.common.security.annotation.EnableCustomConfig;
import com.verify.common.security.annotation.EnableRyFeignClients;

/**
 * 代码生成
 * 
 * @author verify
 */
@EnableCustomConfig
@EnableRyFeignClients
@SpringBootApplication
public class VerifyGenApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(VerifyGenApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  代码生成模块启动成功   ლ(´ڡ`ლ)ﾞ  \n" +
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

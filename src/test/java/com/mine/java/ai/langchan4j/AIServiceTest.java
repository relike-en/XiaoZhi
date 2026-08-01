package com.mine.java.ai.langchan4j;

import com.mine.java.ai.langchain4j.XiaozhiApp;
import com.mine.java.ai.langchain4j.assitant.Assistant;
import dev.langchain4j.community.model.dashscope.QwenChatModel;
import dev.langchain4j.service.AiServices;
import kotlin.reflect.KVariance;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = XiaozhiApp.class)
public class AIServiceTest {

    @Autowired
    private QwenChatModel qwenChatModel;

    @Test
    public void testChat() {
        Assistant assistant = AiServices.create(Assistant.class, qwenChatModel);
        String ans = assistant.chat("你好");
        System.out.println(ans);
    }

    @Autowired
    private Assistant assistant;
    @Test
    public void testAssistant(){
        String ans = assistant.chat("你好");
        System.out.println(ans);
    }

}

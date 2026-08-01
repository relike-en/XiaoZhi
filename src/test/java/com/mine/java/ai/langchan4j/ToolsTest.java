package com.mine.java.ai.langchan4j;

import com.mine.java.ai.langchain4j.XiaozhiApp;
import com.mine.java.ai.langchain4j.assitant.SeparateChatAssistant;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = XiaozhiApp.class)
public class ToolsTest {
    @Autowired
    private SeparateChatAssistant separateChatAssistant;
    @Test
    public void testCalculatorTools() {
    String answer = separateChatAssistant.chat(1, "1+2等于几，475695037565的平方根是多少？");
    //答案：3，689706.4865
    System.out.println(answer);
    }
}
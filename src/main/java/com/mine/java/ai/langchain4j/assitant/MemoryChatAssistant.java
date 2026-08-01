package com.mine.java.ai.langchain4j.assitant;

import dev.langchain4j.service.MemoryId;
import dev.langchain4j.service.UserMessage;
import dev.langchain4j.service.V;
import dev.langchain4j.service.spring.AiService;

import static dev.langchain4j.service.spring.AiServiceWiringMode.EXPLICIT;

@AiService(
        wiringMode = EXPLICIT,
        chatModel = "qwenChatModel",
        chatMemory = "chatMemory"
)
public interface MemoryChatAssistant {
    @UserMessage("你是我的好朋友，请用粤语回答问题，语气可爱一些。 {{message}}")
    String chat(@V("message") String message);

    @UserMessage("你是我的好朋友，请用粤语回答问题，语气可爱一些。 {{message}}")
    String chat2(@MemoryId int memoryId, @V("message") String message);
}

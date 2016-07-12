beans {

    taskExecutor(org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor)
    {
        corePoolSize=7
        maxPoolSize=10
        queueCapacity=20
    }

    asyncProcessor(com.example.AsyncProcessor)
}
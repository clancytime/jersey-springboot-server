beans {
    xmlns executor:"http://www.springframework.org/schema/task"

    taskExecutor(org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor)
    {
        corePoolSize=2
        maxPoolSize=5
        queueCapacity=20
    }
}
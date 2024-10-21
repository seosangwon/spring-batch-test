package com.example.springbatchtest;

import org.springframework.batch.core.Job;
import org.springframework.batch.test.JobLauncherTestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BatchTestConfig {
    @Bean
    public JobLauncherTestUtils helloJobLauncherTestUtils(Job helloJob) {
        JobLauncherTestUtils utils = new JobLauncherTestUtils();
        utils.setJob(helloJob);
        return utils;
    }
    @Bean
    public JobLauncherTestUtils hello2JobLauncherTestUtils(Job hello2Job) {
        JobLauncherTestUtils utils = new JobLauncherTestUtils();
        utils.setJob(hello2Job);
        return utils;
    }

    @Bean
    public JobLauncherTestUtils hello3JobLauncherTestUtils(Job hello3Job) {
        JobLauncherTestUtils utils = new JobLauncherTestUtils();
        utils.setJob(hello3Job);
        return utils;
    }

    @Bean
    public JobLauncherTestUtils hello4JobLauncherTestUtils(Job hello4Job) {
        JobLauncherTestUtils utils = new JobLauncherTestUtils();
        utils.setJob(hello4Job);
        return utils;
    }

    @Bean
    public JobLauncherTestUtils hello5JobLauncherTestUtils(Job hello5Job) {
        JobLauncherTestUtils utils = new JobLauncherTestUtils();
        utils.setJob(hello5Job);
        return utils;
    }




}

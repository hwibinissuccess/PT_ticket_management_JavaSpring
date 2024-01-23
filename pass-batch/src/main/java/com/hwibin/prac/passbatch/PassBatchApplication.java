package com.hwibin.prac.passbatch;


import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

//@EnableBatchProcessing
@SpringBootApplication
public class PassBatchApplication {

//	private final JobBuilderFactory jobBuilder;
//
//	private final StepBuilderFactory stepBuilder;
//
//	public PassBatchApplication(JobBuilderFactory jobBuilder, 	private final StepBuilderFactory stepBuilder;
//	stepBuilder) {
//		this.JobBuilderFactory = jobBuilder;
//		this.StepBuilderFactory = stepBuilder;
//	}
//
//	@Bean
//	public Step passStep(){
//		return this.stepBuilder.get("passStep")
//				.tasklet((Tasklet) (contribution, chunkContext) -> {
//					System.out.println("Execute PassSetp");
//					return RepeatStatus.FINISHED;
//				}).build();
//	}
//
//	@Bean
//	public Job passJob(){
//		return this.jobBuilder.get("passJob")
//				.start(passStep()).build();
//	}


	public static void main(String[] args) {
		SpringApplication.run(PassBatchApplication.class, args);
	}

}

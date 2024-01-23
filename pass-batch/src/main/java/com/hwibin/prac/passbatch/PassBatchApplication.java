package com.hwibin.prac.passbatch;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@EnableBatchProcessing
@SpringBootApplication
public class PassBatchApplication {

//	private final JobBuilder jobBuilder;
//
//	private final StepBuilder stepBuilder;
//
//	public PassBatchApplication(JobBuilder jobBuilder, StepBuilder stepBuilder) {
//		this.jobBuilder = jobBuilder;
//		this.stepBuilder = stepBuilder;
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
//

	public static void main(String[] args) {
		SpringApplication.run(PassBatchApplication.class, args);
	}

}

package com.codeclan.example.WhiskyTracker;

import com.codeclan.example.WhiskyTracker.models.Distillery;
import com.codeclan.example.WhiskyTracker.models.Whisky;
import com.codeclan.example.WhiskyTracker.repositories.DistilleryRepository.DistilleryRepository;
import com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository.WhiskyRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.validation.constraints.Size;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WhiskyTrackerApplicationTests {

	@Autowired
	WhiskyRepository whiskyRepository;

	@Autowired
	DistilleryRepository distilleryRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void cadGetWhiskyByAge(){
		List<Whisky> results = whiskyRepository.findAllWhiskiesByYEar(1995);
 	}

	@Test
	public void cadGetWhiskyByRegion(){
		List<Whisky> results = whiskyRepository.findAllWhiskiesByRegion("Lowland");
	}
	@Test
	public void cadGetDistilleryByRegion(){
		List<Distillery> results = distilleryRepository.findAllDistilleriesByRegion("Highland");
	}
}

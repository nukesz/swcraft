package org.swcraft.javase.collections.list;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

import org.junit.Test;

public class ThreadSafetyTest {

	@Test
	public void testName() throws Exception {
		final ThreadSafety cut = new ThreadSafety();
		
		ExecutorService executor = Executors.newFixedThreadPool(100);
		for (int i = 0; i < 100_000; i++) {
			executor.submit(() -> {
				IntStream.rangeClosed(1, 20).forEach(x -> cut.add(x));
			});	
		}
		
		executor.shutdown();
		executor.awaitTermination(1, TimeUnit.MINUTES);
		System.out.println(cut.size());
		// assertThat(cut.size(), equalTo(2_000_000));
	}
}

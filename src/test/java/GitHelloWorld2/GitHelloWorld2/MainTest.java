package GitHelloWorld2.GitHelloWorld2;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import junit.framework.TestCase;

import org.junit.Test;

public class MainTest extends TestCase {
	@Test
	public void test(){
		assertThat(new Main().test(), is("test"));
	}

	@Test
	public void test2(){
		assertThat(new Main().test(), is("test"));
	}
}

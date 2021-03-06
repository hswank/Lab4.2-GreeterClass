import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GreeterTest {

	@Test
	void test1() {
		Greeter test1 = new Greeter("Welcome");
		String expected = "Welcome, John!";
		String actual = test1.greet("John");
		assertEquals(expected, actual);
	}
	
	@Test
	void test2() {
		Greeter test2 = new Greeter("Hello");
		String expected = "Hello, Jane!";
		String actual = test2.greet("Jane");
		assertEquals(expected, actual);
	}
	
	@Test
	void test3() {
		SimonGreeter test3 = new SimonGreeter("Howdy");
		String expected = "Simon Says, \"Howdy, Dude!\"";
		String actual = test3.greet("Dude");
		assertEquals(expected, actual);
	}
	
	@Test
	void test4() {
		SimonGreeter test4 = new SimonGreeter("Cowabunga");
		String expected = "Simon Says, \"Cowabunga, Man!\"";
		String actual = test4.greet("Man");
		assertEquals(expected, actual);
	}
	
	@Test
	void test5() {
		LoudGreeter test5 = new LoudGreeter("Hola");
		String expected = "Hola, Amigo!!";
		String actual = test5.greet("Amigo");
		assertEquals(expected, actual);
	}
	
	@Test
	void test6() {
		LoudGreeter test6 = new LoudGreeter("Hola");
		test6.addVolume();
		String expected = "Hola, Amigo!!!";
		String actual = test6.greet("Amigo");
		assertEquals(expected, actual);
	}
	
	@Test
	void test7() {
		LoudGreeter test7 = new LoudGreeter("Hola");
		test7.addVolume();
		test7.addVolume();
		test7.addVolume();
		test7.addVolume();
		String expected = "Hola, Amigo!!!!!!";
		String actual = test7.greet("Amigo");
		assertEquals(expected, actual);
	}
	
	@Test
	void test8() {
		HtmlGreeter test8 = new HtmlGreeter("Hey");
		String expected = "<h1>Hey, buddy!</h1>";
		String actual = test8.greet("buddy");
		assertEquals(expected, actual);
	}
	
	@Test
	void test9() {
		HtmlGreeter test9 = new HtmlGreeter("Ahoy", "h2");
		String expected = "<h2>Ahoy, matey!</h2>";
		String actual = test9.greet("matey");
		assertEquals(expected, actual);
	}
	
	@Test
	void test10() {
		HtmlGreeter test10 = new HtmlGreeter("What's up", "h3");
		String expected = "<h3>What's up, doc!</h3>";
		String actual = test10.greet("doc");
		assertEquals(expected, actual);
	}
	
	@Test
	void test11() {
		HtmlGreeter test11 = new HtmlGreeter("Greetings", "h4");
		String expected = "<h4>Greetings, earthling!</h4>";
		String actual = test11.greet("earthling");
		assertEquals(expected, actual);
	}

}

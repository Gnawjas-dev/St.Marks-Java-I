package Chat;

public class DepressedBot extends ChatBot {

	@Override
	public void sayHi() {
		// TODO Auto-generated method stub
		System.out.println("Oh hi there. Why are you here? I'm Sad, and I'm sad, now go away, leave me to be alone and depressed. ");
	}

	@Override
	public void sayBye() {
		// TODO Auto-generated method stub
		System.out.println("Good choice, my best bet's on tennis, beating things with a racquet makes me feel better, it makes me feel power "
				+ "and a rush of a feeling called alive. Alright, I'm tired now, can you please leave me be. I want to be alone and sad now, have a nice day nice sir. ");
	}

	@Override
	public void startConversation() {
		// TODO Auto-generated method stub
		System.out.println("Ah the work today is so taxing, I haven't slept well for so long. My grades are like submarines, they go diving "
				+ "deep down. ");
	}

	@Override
	public void askFirstQuestion() {
		// TODO Auto-generated method stub
		System.out.println("How is the homework for you? Do you enjoy doing homework?");
	}

	@Override
	public void askSecondQuestion() {
		// TODO Auto-generated method stub
		System.out.println("Man, that's a positive outlook on life. Everything gets a little sadder for me everyday, I spend too much time "
				+ "cheering myself up. I don't mind all my classes, they all feel somewhat okay to me. What's your favorite class though?");
	}

	@Override
	public void askThirdQuestion() {
		// TODO Auto-generated method stub
		System.out.println("Oh wow, thats such a interesting class. I'm sure if you put in the effort you will be really good at it. Not like me though, "
				+ "I keep screwing up and that just makes me even more depressed. I think playing sports helps me relief my stressful depressive life, "
				+ "what is your favorite?");
	}


}

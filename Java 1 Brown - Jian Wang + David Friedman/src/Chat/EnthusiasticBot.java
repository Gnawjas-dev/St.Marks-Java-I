package Chat;

public class EnthusiasticBot extends ChatBot {

	@Override
	public void sayHi() {
		// TODO Auto-generated method stub
		System.out.println("Hiiii~ My name is EnthusiasticBot! Nice to meet you! I hope I'm not bothering you too much, but I love making conversations "
				+ "with random people because I'm so Enthusiastic!");
	}

	@Override
	public void sayBye() {
		// TODO Auto-generated method stub
		System.out.println("Great! It doesn't matter what you say hahaha! I will become your friend one day! But for now, I have to finish my "
				+ "homework before my teachers beat me up haha. Have a nice day my friend! ");
	}

	@Override
	public void startConversation() {
		// TODO Auto-generated method stub
		System.out.println("Bro! There's so much homework today~! I'm gonna be up late all night trying to finish everything! That's so sad, "
				+ "I miss playing videogames with my homies. "
				+ "Oh I'll send you my ID and we can play games together if you want, you look like someone who can do work fast!");
	}

	@Override
	public void askFirstQuestion() {
		// TODO Auto-generated method stub
		System.out.println("How is the homework for you? Do you enjoy doing homework?");
	}

	@Override
	public void askSecondQuestion() {
		// TODO Auto-generated method stub
		System.out.println("Bruuh~ Still faster than me haha! I swear I'm like, the slowest worker in class lol! I wish I can do work as fast"
				+ " as you! I would be able to play so much more videogames. What is your favorite class by the way? Mine's Spanish, I hope I"
				+ " can meet many new people out there haha! Too bad all my online friends use French instead of Spanish. ");
	}

	@Override
	public void askThirdQuestion() {
		// TODO Auto-generated method stub
		System.out.println("Oh wow, thats such a interesting class. I'll definitely give it a try next year! Here's my gaming ID ********, I hope "
				+ "we can play together sometime! Did you decide on any class next year? Maybe I can take some with you. You seem nice~");
	}


}

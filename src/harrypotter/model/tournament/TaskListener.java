package harrypotter.model.tournament;

import harrypotter.model.character.Champion;

import java.io.IOException;
import java.util.ArrayList;

public interface TaskListener {

	public void onFinishingFirstTask(ArrayList<Champion> winners)
			throws IOException;

	public void onFinishingSecondTask(ArrayList<Champion> winners)
			throws IOException;

	public void onFinishingThirdTask(Champion winner);

	public void actionEffect(int damageAmount);

	public void encounteringForiegnTreasure(int x, int y);

	public void championWon(Champion currentChamp);

}

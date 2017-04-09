package com.counterpart.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.counterpart.game.screens.GameScreen;

public class CounterpartGame extends Game {
	private SpriteBatch batch;
	private Screen gameScreen;
	
	@Override
	public void create () {
		batch = new SpriteBatch();

		gameScreen = new GameScreen(batch);
		setScreen(gameScreen);
	}

	@Override
	public void render () { super.render(); }
	
	@Override
	public void dispose () {
		batch.dispose();
		gameScreen.dispose();
	}
}

package com.cybage.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class TextEditor {

	String text;
	@Autowired
	@Qualifier("spellChecker1")
	SpellChecker spellChecker;
	
	public TextEditor() {
		System.out.println("Inside Text Editor Default Constructor");
		text="Default Text";
	}

	public TextEditor(String text, SpellChecker spellChecker) {
		super();
		this.text = text;
		this.spellChecker = spellChecker;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public SpellChecker getSpellChecker() {
		return spellChecker;
	}

	public void setSpellChecker(SpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}

	@Override
	public String toString() {
		return "TextEditor [text=" + text + ", spellChecker=" + spellChecker + "]";
	}
}

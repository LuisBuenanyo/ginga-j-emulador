package br.org.sbtvd.ui;

import com.sun.dtv.lwuit.Component;
import com.sun.dtv.lwuit.Graphics;

import com.sun.dtv.lwuit.events.FocusListener;

import com.sun.dtv.lwuit.geom.Dimension;
import com.sun.dtv.lwuit.geom.Rectangle;

import com.sun.dtv.lwuit.plaf.Style;

public final class SwitchArea extends Component {

	public SwitchArea() {
		setUIID("SwitchArea");
	}

	@Override
	public void addFocusListener(FocusListener l) {
	}

	//SwitchArea component does not support animation
	@Override
	public boolean animate() {
		return false;
	}

	@Override
	public boolean contains(int x, int y) {
		return super.contains(x, y);
	}

	@Override
	public int getAnimationMode() {
		return super.getAnimationMode();
	}

	@Override
	public int getDelay() {
		return super.getDelay();
	}

	@Override
	public Rectangle getBounds() {
		return super.getBounds();
	}

	@Override
	public Object getClientProperty(String key) {
		return super.getClientProperty(key);
	}

	@Override
	public int getRepetitionMode() {
		return super.getRepetitionMode();
	}

	@Override
	public int getScrollAnimationSpeed() {
		return super.getScrollAnimationSpeed();
	}

	@Override
	public boolean isRunning() {
		return false;
	}

	@Override
	public boolean isScrollVisible() {
		return false;
	}

	@Override
	protected boolean isScrollable() {
		return false;
	}

	@Override
	public boolean isScrollableX() {
		return false;
	}

	@Override
	public boolean isScrollableY() {
		return false;
	}

	@Override
	public boolean isSmoothScrolling() {
		return false;
	}

	@Override
	public void jumpTo(int position) {
	}

	@Override
	public void setAnimationMode(int mode) {
	}

	@Override
	public void setDelay(int n) {
	}

	@Override
	public void setIsScrollVisible(boolean isScrollVisible) {
	}

	@Override
	public void setRepetitionMode(int n) {
	}

	@Override
	public void setScrollAnimationSpeed(int animationSpeed) {
	}

	@Override
	public void setSmoothScrolling(boolean smoothScrolling) {
	}

	@Override
	public void start() {
	}

	@Override
	public void stop() {
	}

	//SwitchArea does not support focus functionalities
	@Override
	public Component getNextFocusDown() {
		return null;
	}

	@Override
	public Component getNextFocusLeft() {
		return null;
	}

	@Override
	public Component getNextFocusRight() {
		return null;
	}

	@Override
	public Component getNextFocusUp() {
		return null;
	}

	@Override
	public boolean hasFocus() {
		return false;
	}

	@Override
	public boolean isFocusPainted() {
		return false;
	}

	@Override
	public boolean isFocusable() {
		return false;
	}

	@Override
	public void keyPressed(int keyCode) {
	}

	@Override
	public void keyReleased(int keyCode) {
	}

	@Override
	public void keyRepeated(int keyCode) {
	}

	@Override
	public void longKeyPress(int keyCode) {
	}

	@Override
	public void removeFocusListener(FocusListener l) {
	}

	@Override
	public void requestFocus() {
	}

	@Override
	public void setFocus(boolean focused) {
	}

	@Override
	public void setFocusPainted(boolean focusPainted) {
	}

	@Override
	public void setFocusable(boolean focusable) {
	}

	@Override
	public void setHandlesInput(boolean handlesInput) {
	}

	@Override
	public void setNextFocusDown(Component nextFocusDown) {
	}

	@Override
	public void setNextFocusLeft(Component nextFocusLeft) {
	}

	@Override
	public void setNextFocusRight(Component nextFocusRight) {
	}

	@Override
	public void setNextFocusUp(Component nextFocusUp) {
	}

	//Paint methods
	@Override
	public void repaint() {
	}

	@Override
	public void repaint(int x, int y, int w, int h) {
	}

	@Override
	public void repaint(Component cmp) {
	}

	@Override
	public void paint(Graphics g) {
	}

	@Override
	public void paintBackgrounds(Graphics g) {
	}

	@Override
	public void setPreferredSize(Dimension d) {
	}

	@Override
	public void setSize(Dimension d) {
	}

	@Override
	public void setVisible(boolean visible) {
	}

	@Override
	public void setWidth(int width) {
	}

	@Override
	public void setX(int x) {
	}

	@Override
	public void setY(int y) {
	}

	@Override
	public void setStyle(Style style) {
	}

	@Override
	public void styleChanged(String propertyName, Style source) {
	}

	@Override
	public void update(Graphics g) {
	}
}

/******************************************************************************
 * Este arquivo eh parte da implementacao do Projeto OpenGinga
 *
 * Direitos Autorais Reservados (c) 2005-2009 UFPB/LAVID
 *
 * Este programa eh software livre; voce pode redistribui-lo e/ou modificah-lo sob
 * os termos da Licenca Publica Geral GNU versao 2 conforme publicada pela Free
 * Software Foundation.
 *
 * Este programa eh distribuido na expectativa de que seja util, porem, SEM
 * NENHUMA GARANTIA; nem mesmo a garantia implicita de COMERCIABILIDADE OU
 * ADEQUACAO A UMA FINALIDADE ESPECIFICA. Consulte a Licenca Publica Geral do
 * GNU versao 2 para mais detalhes.
 *
 * Voce deve ter recebido uma copia da Licenca Publica Geral do GNU versao 2 junto
 * com este programa; se nao, escreva para a Free Software Foundation, Inc., no
 * endereco 59 Temple Street, Suite 330, Boston, MA 02111-1307 USA.
 *
 * Para maiores informacoes:
 * ginga @ lavid.ufpb.br
 * http://www.openginga.org
 * http://www.ginga.org.br
 * http://www.lavid.ufpb.br
 * ******************************************************************************
 * This file is part of OpenGinga Project
 *
 * Copyright: 2005-2009 UFPB/LAVID, All Rights Reserved.
 *
 * This program is free software; you can redistribute it and/or modify it under
 * the terms of the GNU General Public License version 2 as published by
 * the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A
 * PARTICULAR PURPOSE.  See the GNU General Public License version 2 for more
 * details.
 *
 * You should have received a copy of the GNU General Public License version 2
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA
 *
 * For further information contact:
 * ginga @ lavid.ufpb.br
 * http://www.openginga.org
 * http://www.ginga.org.br
 * http://www.lavid.ufpb.br
 * *******************************************************************************/
package com.sun.dtv.tuner;

/**
 * <HR>
 * </PRE>
 * 
 * An exception for synchronous reporting of tuning failures.
 * 
 * <HR>
 * 
 * 
 * <!-- ======== CONSTRUCTOR SUMMARY ======== -->
 * 
 * <A NAME="constructor_summary"><!-- --></A>
 * <TABLE BORDER="1" WIDTH="100%" CELLPADDING="3" CELLSPACING="0" SUMMARY="">
 * <TR BGCOLOR="#CCCCFF" CLASS="TableHeadingColor">
 * <TH ALIGN="left" COLSPAN="2"><FONT SIZE="+2">
 * <B>Constructor Summary</B></FONT></TH>
 * </TR>
 * <TR BGCOLOR="white" CLASS="TableRowColor">
 * <TD><CODE><B><A HREF="../../../../com/sun/dtv/tuner/TuningException.html#TuningException()">TuningException</A></B>()</CODE>
 * 
 * <BR>
 * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Constructs a new TuningException with a <code>null</code> detail message.</TD>
 * </TR>
 * <TR BGCOLOR="white" CLASS="TableRowColor">
 * <TD><CODE><B><A HREF="../../../../com/sun/dtv/tuner/TuningException.html#TuningException(java.lang.String)">TuningException</A></B>(<A HREF="http://java.sun.com/javame/reference/apis/jsr219/java/lang/String.html?is-external=true" title="class or interface in java.lang">String</A>&nbsp;message)</CODE>
 * 
 * <BR>
 * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Constructs a new TuningException with the specified detail message.</TD>
 * </TR>
 * </TABLE>
 * &nbsp;
 * <!-- ========== METHOD SUMMARY =========== -->
 * 
 * <A NAME="method_summary"><!-- --></A>
 * <TABLE BORDER="1" WIDTH="100%" CELLPADDING="3" CELLSPACING="0" SUMMARY="">
 * <TR BGCOLOR="#CCCCFF" CLASS="TableHeadingColor">
 * <TH ALIGN="left" COLSPAN="2"><FONT SIZE="+2">
 * <B>Method Summary</B></FONT></TH>
 * </TR>
 * </TABLE>
 * &nbsp;<A NAME="methods_inherited_from_class_java.lang.Throwable"><!-- --></A>
 * <TABLE BORDER="1" WIDTH="100%" CELLPADDING="3" CELLSPACING="0" SUMMARY="">
 * <TR BGCOLOR="#EEEEFF" CLASS="TableSubHeadingColor">
 * <TH ALIGN="left"><B>Methods inherited from class java.lang.<A HREF="http://java.sun.com/javame/reference/apis/jsr219/java/lang/Throwable.html?is-external=true" title="class or interface in java.lang">Throwable</A></B></TH>
 * </TR>
 * <TR BGCOLOR="white" CLASS="TableRowColor">
 * <TD><CODE><A HREF="http://java.sun.com/javame/reference/apis/jsr219/java/lang/Throwable.html?is-external=true#fillInStackTrace()" title="class or interface in java.lang">fillInStackTrace</A>, <A HREF="http://java.sun.com/javame/reference/apis/jsr219/java/lang/Throwable.html?is-external=true#getCause()" title="class or interface in java.lang">getCause</A>, <A HREF="http://java.sun.com/javame/reference/apis/jsr219/java/lang/Throwable.html?is-external=true#getLocalizedMessage()" title="class or interface in java.lang">getLocalizedMessage</A>, <A HREF="http://java.sun.com/javame/reference/apis/jsr219/java/lang/Throwable.html?is-external=true#getMessage()" title="class or interface in java.lang">getMessage</A>, <A HREF="http://java.sun.com/javame/reference/apis/jsr219/java/lang/Throwable.html?is-external=true#getStackTrace()" title="class or interface in java.lang">getStackTrace</A>, <A HREF="http://java.sun.com/javame/reference/apis/jsr219/java/lang/Throwable.html?is-external=true#initCause(java.lang.Throwable)" title="class or interface in java.lang">initCause</A>, <A HREF="http://java.sun.com/javame/reference/apis/jsr219/java/lang/Throwable.html?is-external=true#printStackTrace()" title="class or interface in java.lang">printStackTrace</A>, <A HREF="http://java.sun.com/javame/reference/apis/jsr219/java/lang/Throwable.html?is-external=true#printStackTrace(java.io.PrintStream)" title="class or interface in java.lang">printStackTrace</A>, <A HREF="http://java.sun.com/javame/reference/apis/jsr219/java/lang/Throwable.html?is-external=true#printStackTrace(java.io.PrintWriter)" title="class or interface in java.lang">printStackTrace</A>, <A HREF="http://java.sun.com/javame/reference/apis/jsr219/java/lang/Throwable.html?is-external=true#setStackTrace(java.lang.StackTraceElement[])" title="class or interface in java.lang">setStackTrace</A>, <A HREF="http://java.sun.com/javame/reference/apis/jsr219/java/lang/Throwable.html?is-external=true#toString()" title="class or interface in java.lang">toString</A></CODE></TD>
 * </TR>
 * </TABLE>
 * &nbsp;<A NAME="methods_inherited_from_class_java.lang.Object"><!-- --></A>
 * <TABLE BORDER="1" WIDTH="100%" CELLPADDING="3" CELLSPACING="0" SUMMARY="">
 * <TR BGCOLOR="#EEEEFF" CLASS="TableSubHeadingColor">
 * <TH ALIGN="left"><B>Methods inherited from class java.lang.<A HREF="http://java.sun.com/javame/reference/apis/jsr219/java/lang/Object.html?is-external=true" title="class or interface in java.lang">Object</A></B></TH>
 * </TR>
 * <TR BGCOLOR="white" CLASS="TableRowColor">
 * <TD><CODE><A HREF="http://java.sun.com/javame/reference/apis/jsr219/java/lang/Object.html?is-external=true#clone()" title="class or interface in java.lang">clone</A>, <A HREF="http://java.sun.com/javame/reference/apis/jsr219/java/lang/Object.html?is-external=true#equals(java.lang.Object)" title="class or interface in java.lang">equals</A>, <A HREF="http://java.sun.com/javame/reference/apis/jsr219/java/lang/Object.html?is-external=true#finalize()" title="class or interface in java.lang">finalize</A>, <A HREF="http://java.sun.com/javame/reference/apis/jsr219/java/lang/Object.html?is-external=true#getClass()" title="class or interface in java.lang">getClass</A>, <A HREF="http://java.sun.com/javame/reference/apis/jsr219/java/lang/Object.html?is-external=true#hashCode()" title="class or interface in java.lang">hashCode</A>, <A HREF="http://java.sun.com/javame/reference/apis/jsr219/java/lang/Object.html?is-external=true#notify()" title="class or interface in java.lang">notify</A>, <A HREF="http://java.sun.com/javame/reference/apis/jsr219/java/lang/Object.html?is-external=true#notifyAll()" title="class or interface in java.lang">notifyAll</A>, <A HREF="http://java.sun.com/javame/reference/apis/jsr219/java/lang/Object.html?is-external=true#wait()" title="class or interface in java.lang">wait</A>, <A HREF="http://java.sun.com/javame/reference/apis/jsr219/java/lang/Object.html?is-external=true#wait(long)" title="class or interface in java.lang">wait</A>, <A HREF="http://java.sun.com/javame/reference/apis/jsr219/java/lang/Object.html?is-external=true#wait(long, int)" title="class or interface in java.lang">wait</A></CODE></TD>
 * </TR>
 * </TABLE>
 * &nbsp;
 * 
 * <!-- ========= CONSTRUCTOR DETAIL ======== -->
 * 
 * <A NAME="constructor_detail"><!-- --></A>
 * <TABLE BORDER="1" WIDTH="100%" CELLPADDING="3" CELLSPACING="0" SUMMARY="">
 * <TR BGCOLOR="#CCCCFF" CLASS="TableHeadingColor">
 * <TH ALIGN="left" COLSPAN="1"><FONT SIZE="+2">
 * <B>Constructor Detail</B></FONT></TH>
 * </TR>
 * </TABLE>
 * 
 * <A NAME="TuningException()"><!-- --></A><H3>
 * TuningException</H3>
 * <PRE>
 * public <B>TuningException</B>()</PRE>
 * <DD>Constructs a new TuningException with a <code>null</code> detail message.
 * <HR>
 * 
 * <A NAME="TuningException(java.lang.String)"><!-- --></A><H3>
 * TuningException</H3>
 * <PRE>
 * public <B>TuningException</B>(<A HREF="http://java.sun.com/javame/reference/apis/jsr219/java/lang/String.html?is-external=true" title="class or interface in java.lang">String</A>&nbsp;message)</PRE>
 * <DD>Constructs a new TuningException with the specified detail message.
 * <!-- ========= END OF CLASS DATA ========= -->
 * <HR>
 * 
 * 
 * <!-- ======= START OF BOTTOM NAVBAR ====== -->
 * <A NAME="navbar_bottom"><!-- --></A>
 * <A HREF="#skip-navbar_bottom" title="Skip navigation links"></A>
 * <TABLE BORDER="0" WIDTH="100%" CELLPADDING="1" CELLSPACING="0" SUMMARY="">
 * <TR>
 * <TD COLSPAN=2 BGCOLOR="#EEEEFF" CLASS="NavBarCell1">
 * <A NAME="navbar_bottom_firstrow"><!-- --></A>
 * <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="3" SUMMARY="">
 * <TR ALIGN="center" VALIGN="top">
 * <TD BGCOLOR="#EEEEFF" CLASS="NavBarCell1">    <A HREF="../../../../overview-summary.html"><FONT CLASS="NavBarFont1"><B>Overview</B></FONT></A>&nbsp;</TD>
 * <TD BGCOLOR="#EEEEFF" CLASS="NavBarCell1">    <A HREF="package-summary.html"><FONT CLASS="NavBarFont1"><B>Package</B></FONT></A>&nbsp;</TD>
 * <TD BGCOLOR="#FFFFFF" CLASS="NavBarCell1Rev"> &nbsp;<FONT CLASS="NavBarFont1Rev"><B>Class</B></FONT>&nbsp;</TD>
 * <TD BGCOLOR="#EEEEFF" CLASS="NavBarCell1">    <A HREF="class-use/TuningException.html"><FONT CLASS="NavBarFont1"><B>Use</B></FONT></A>&nbsp;</TD>
 * <TD BGCOLOR="#EEEEFF" CLASS="NavBarCell1">    <A HREF="../../../../deprecated-list.html"><FONT CLASS="NavBarFont1"><B>Deprecated</B></FONT></A>&nbsp;</TD>
 * <TD BGCOLOR="#EEEEFF" CLASS="NavBarCell1">    <A HREF="../../../../index-all.html"><FONT CLASS="NavBarFont1"><B>Index</B></FONT></A>&nbsp;</TD>
 * <TD BGCOLOR="#EEEEFF" CLASS="NavBarCell1">    <A HREF="../../../../help-doc.html"><FONT CLASS="NavBarFont1"><B>Help</B></FONT></A>&nbsp;</TD>
 * </TR>
 * </TABLE>
 * </TD>
 * <TD ALIGN="right" VALIGN="top" ROWSPAN=3><EM>
 * Java DTV API 1.1<br>28-Feb-2009</EM>
 * </TD>
 * </TR>
 * 
 * <TR>
 * <TD BGCOLOR="white" CLASS="NavBarCell2"><FONT SIZE="-2">
 * &nbsp;<A HREF="../../../../com/sun/dtv/tuner/TuningEvent.html" title="class in com.sun.dtv.tuner"><B>PREV CLASS</B></A>&nbsp;
 * &nbsp;<A HREF="../../../../com/sun/dtv/tuner/TuningFailedEvent.html" title="class in com.sun.dtv.tuner"><B>NEXT CLASS</B></A></FONT></TD>
 * <TD BGCOLOR="white" CLASS="NavBarCell2"><FONT SIZE="-2">
 * <A HREF="../../../../index.html?com/sun/dtv/tuner/TuningException.html" target="_top"><B>FRAMES</B></A>  &nbsp;
 * &nbsp;<A HREF="TuningException.html" target="_top"><B>NO FRAMES</B></A>  &nbsp;
 * &nbsp;<SCRIPT type="text/javascript">
 * <!--
 * if(window==top) {
 * document.writeln('<A HREF="../../../../allclasses-noframe.html"><B>All Classes</B></A>');
 * }
 * //-->
 * </SCRIPT>
 * <NOSCRIPT>
 * <A HREF="../../../../allclasses-noframe.html"><B>All Classes</B></A>
 * </NOSCRIPT>
 * 
 * 
 * </FONT></TD>
 * </TR>
 * <TR>
 * <TD VALIGN="top" CLASS="NavBarCell3"><FONT SIZE="-2">
 * SUMMARY:&nbsp;NESTED&nbsp;|&nbsp;FIELD&nbsp;|&nbsp;<A HREF="#constructor_summary">CONSTR</A>&nbsp;|&nbsp;<A HREF="#methods_inherited_from_class_java.lang.Throwable">METHOD</A></FONT></TD>
 * <TD VALIGN="top" CLASS="NavBarCell3"><FONT SIZE="-2">
 * DETAIL:&nbsp;FIELD&nbsp;|&nbsp;<A HREF="#constructor_detail">CONSTR</A>&nbsp;|&nbsp;METHOD</FONT></TD>
 * </TR>
 * </TABLE>
 * <A NAME="skip-navbar_bottom"></A>
 * <!-- ======== END OF BOTTOM NAVBAR ======= -->
 * 
 * <HR>
 * </BODY>
 * </HTML>
 * 
 */
public class TuningException extends Exception 
{

	/**
	 * Constructs a new TuningException with a <code>null</code> detail message.
	 *
	 * 
	 */
	public TuningException()
	{
		super();
	}

	/**
	 * Constructs a new TuningException with the specified detail message.
	 *
	 * 
	 * @param message - a message explaining the cause of the exception
	 */
	public TuningException(String message)
	{
		super(message);
		//TODO implement TuningException
	}
	

}

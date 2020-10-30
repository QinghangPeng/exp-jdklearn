// Log wrapper class for Sun private system exceptions in group IOR
//
// Generated by MC.java version 1.0, DO NOT EDIT BY HAND!
// Generated from input file /HUDSON/workspace/8-2-build-linux-amd64/jdk8u221/13320/corba/src/share/classes/com/sun/corba/se/spi/logging/data/IOR.mc on Thu Jul 04 04:27:07 PDT 2019

package com.sun.corba.se.impl.logging ;

import java.util.logging.Logger ;
import java.util.logging.Level ;

import org.omg.CORBA.OMGVMCID ;
import com.sun.corba.se.impl.util.SUNVMCID ;
import org.omg.CORBA.CompletionStatus ;
import org.omg.CORBA.SystemException ;

import com.sun.corba.se.spi.orb.ORB ;

import com.sun.corba.se.spi.logging.LogWrapperFactory;

import com.sun.corba.se.spi.logging.LogWrapperBase;

import org.omg.CORBA.INTERNAL ;
import org.omg.CORBA.BAD_OPERATION ;
import org.omg.CORBA.BAD_PARAM ;
import org.omg.CORBA.INV_OBJREF ;

public class IORSystemException extends LogWrapperBase {
    
    public IORSystemException( Logger logger )
    {
        super( logger ) ;
    }
    
    private static LogWrapperFactory factory = new LogWrapperFactory() {
        public LogWrapperBase create( Logger logger )
        {
            return new IORSystemException( logger ) ;
        }
    } ;
    
    public static IORSystemException get( ORB orb, String logDomain )
    {
        IORSystemException wrapper = 
            (IORSystemException) orb.getLogWrapper( logDomain, 
                "IOR", factory ) ;
        return wrapper ;
    } 
    
    public static IORSystemException get( String logDomain )
    {
        IORSystemException wrapper = 
            (IORSystemException) ORB.staticGetLogWrapper( logDomain, 
                "IOR", factory ) ;
        return wrapper ;
    } 
    
    ///////////////////////////////////////////////////////////
    // INTERNAL
    ///////////////////////////////////////////////////////////
    
    public static final int ORT_NOT_INITIALIZED = SUNVMCID.value + 1201 ;
    
    public INTERNAL ortNotInitialized( CompletionStatus cs, Throwable t ) {
        INTERNAL exc = new INTERNAL( ORT_NOT_INITIALIZED, cs ) ;
        if (t != null)
            exc.initCause( t ) ;
        
        if (logger.isLoggable( Level.WARNING )) {
            Object[] parameters = null ;
            doLog( Level.WARNING, "IOR.ortNotInitialized",
                parameters, IORSystemException.class, exc ) ;
        }
        
        return exc ;
    }
    
    public INTERNAL ortNotInitialized( CompletionStatus cs ) {
        return ortNotInitialized( cs, null  ) ;
    }
    
    public INTERNAL ortNotInitialized( Throwable t ) {
        return ortNotInitialized( CompletionStatus.COMPLETED_NO, t  ) ;
    }
    
    public INTERNAL ortNotInitialized(  ) {
        return ortNotInitialized( CompletionStatus.COMPLETED_NO, null  ) ;
    }
    
    public static final int NULL_POA = SUNVMCID.value + 1202 ;
    
    public INTERNAL nullPoa( CompletionStatus cs, Throwable t ) {
        INTERNAL exc = new INTERNAL( NULL_POA, cs ) ;
        if (t != null)
            exc.initCause( t ) ;
        
        if (logger.isLoggable( Level.WARNING )) {
            Object[] parameters = null ;
            doLog( Level.WARNING, "IOR.nullPoa",
                parameters, IORSystemException.class, exc ) ;
        }
        
        return exc ;
    }
    
    public INTERNAL nullPoa( CompletionStatus cs ) {
        return nullPoa( cs, null  ) ;
    }
    
    public INTERNAL nullPoa( Throwable t ) {
        return nullPoa( CompletionStatus.COMPLETED_NO, t  ) ;
    }
    
    public INTERNAL nullPoa(  ) {
        return nullPoa( CompletionStatus.COMPLETED_NO, null  ) ;
    }
    
    public static final int BAD_MAGIC = SUNVMCID.value + 1203 ;
    
    public INTERNAL badMagic( CompletionStatus cs, Throwable t, Object arg0) {
        INTERNAL exc = new INTERNAL( BAD_MAGIC, cs ) ;
        if (t != null)
            exc.initCause( t ) ;
        
        if (logger.isLoggable( Level.WARNING )) {
            Object[] parameters = new Object[1] ;
            parameters[0] = arg0 ;
            doLog( Level.WARNING, "IOR.badMagic",
                parameters, IORSystemException.class, exc ) ;
        }
        
        return exc ;
    }
    
    public INTERNAL badMagic( CompletionStatus cs, Object arg0) {
        return badMagic( cs, null, arg0 ) ;
    }
    
    public INTERNAL badMagic( Throwable t, Object arg0) {
        return badMagic( CompletionStatus.COMPLETED_NO, t, arg0 ) ;
    }
    
    public INTERNAL badMagic(  Object arg0) {
        return badMagic( CompletionStatus.COMPLETED_NO, null, arg0 ) ;
    }
    
    public static final int STRINGIFY_WRITE_ERROR = SUNVMCID.value + 1204 ;
    
    public INTERNAL stringifyWriteError( CompletionStatus cs, Throwable t ) {
        INTERNAL exc = new INTERNAL( STRINGIFY_WRITE_ERROR, cs ) ;
        if (t != null)
            exc.initCause( t ) ;
        
        if (logger.isLoggable( Level.WARNING )) {
            Object[] parameters = null ;
            doLog( Level.WARNING, "IOR.stringifyWriteError",
                parameters, IORSystemException.class, exc ) ;
        }
        
        return exc ;
    }
    
    public INTERNAL stringifyWriteError( CompletionStatus cs ) {
        return stringifyWriteError( cs, null  ) ;
    }
    
    public INTERNAL stringifyWriteError( Throwable t ) {
        return stringifyWriteError( CompletionStatus.COMPLETED_NO, t  ) ;
    }
    
    public INTERNAL stringifyWriteError(  ) {
        return stringifyWriteError( CompletionStatus.COMPLETED_NO, null  ) ;
    }
    
    public static final int TAGGED_PROFILE_TEMPLATE_FACTORY_NOT_FOUND = SUNVMCID.value + 1205 ;
    
    public INTERNAL taggedProfileTemplateFactoryNotFound( CompletionStatus cs, Throwable t, Object arg0) {
        INTERNAL exc = new INTERNAL( TAGGED_PROFILE_TEMPLATE_FACTORY_NOT_FOUND, cs ) ;
        if (t != null)
            exc.initCause( t ) ;
        
        if (logger.isLoggable( Level.WARNING )) {
            Object[] parameters = new Object[1] ;
            parameters[0] = arg0 ;
            doLog( Level.WARNING, "IOR.taggedProfileTemplateFactoryNotFound",
                parameters, IORSystemException.class, exc ) ;
        }
        
        return exc ;
    }
    
    public INTERNAL taggedProfileTemplateFactoryNotFound( CompletionStatus cs, Object arg0) {
        return taggedProfileTemplateFactoryNotFound( cs, null, arg0 ) ;
    }
    
    public INTERNAL taggedProfileTemplateFactoryNotFound( Throwable t, Object arg0) {
        return taggedProfileTemplateFactoryNotFound( CompletionStatus.COMPLETED_NO, t, arg0 ) ;
    }
    
    public INTERNAL taggedProfileTemplateFactoryNotFound(  Object arg0) {
        return taggedProfileTemplateFactoryNotFound( CompletionStatus.COMPLETED_NO, null, arg0 ) ;
    }
    
    public static final int INVALID_JDK1_3_1_PATCH_LEVEL = SUNVMCID.value + 1206 ;
    
    public INTERNAL invalidJdk131PatchLevel( CompletionStatus cs, Throwable t, Object arg0) {
        INTERNAL exc = new INTERNAL( INVALID_JDK1_3_1_PATCH_LEVEL, cs ) ;
        if (t != null)
            exc.initCause( t ) ;
        
        if (logger.isLoggable( Level.WARNING )) {
            Object[] parameters = new Object[1] ;
            parameters[0] = arg0 ;
            doLog( Level.WARNING, "IOR.invalidJdk131PatchLevel",
                parameters, IORSystemException.class, exc ) ;
        }
        
        return exc ;
    }
    
    public INTERNAL invalidJdk131PatchLevel( CompletionStatus cs, Object arg0) {
        return invalidJdk131PatchLevel( cs, null, arg0 ) ;
    }
    
    public INTERNAL invalidJdk131PatchLevel( Throwable t, Object arg0) {
        return invalidJdk131PatchLevel( CompletionStatus.COMPLETED_NO, t, arg0 ) ;
    }
    
    public INTERNAL invalidJdk131PatchLevel(  Object arg0) {
        return invalidJdk131PatchLevel( CompletionStatus.COMPLETED_NO, null, arg0 ) ;
    }
    
    public static final int GET_LOCAL_SERVANT_FAILURE = SUNVMCID.value + 1207 ;
    
    public INTERNAL getLocalServantFailure( CompletionStatus cs, Throwable t, Object arg0) {
        INTERNAL exc = new INTERNAL( GET_LOCAL_SERVANT_FAILURE, cs ) ;
        if (t != null)
            exc.initCause( t ) ;
        
        if (logger.isLoggable( Level.FINE )) {
            Object[] parameters = new Object[1] ;
            parameters[0] = arg0 ;
            doLog( Level.FINE, "IOR.getLocalServantFailure",
                parameters, IORSystemException.class, exc ) ;
        }
        
        return exc ;
    }
    
    public INTERNAL getLocalServantFailure( CompletionStatus cs, Object arg0) {
        return getLocalServantFailure( cs, null, arg0 ) ;
    }
    
    public INTERNAL getLocalServantFailure( Throwable t, Object arg0) {
        return getLocalServantFailure( CompletionStatus.COMPLETED_NO, t, arg0 ) ;
    }
    
    public INTERNAL getLocalServantFailure(  Object arg0) {
        return getLocalServantFailure( CompletionStatus.COMPLETED_NO, null, arg0 ) ;
    }
    
    ///////////////////////////////////////////////////////////
    // BAD_OPERATION
    ///////////////////////////////////////////////////////////
    
    public static final int ADAPTER_ID_NOT_AVAILABLE = SUNVMCID.value + 1201 ;
    
    public BAD_OPERATION adapterIdNotAvailable( CompletionStatus cs, Throwable t ) {
        BAD_OPERATION exc = new BAD_OPERATION( ADAPTER_ID_NOT_AVAILABLE, cs ) ;
        if (t != null)
            exc.initCause( t ) ;
        
        if (logger.isLoggable( Level.WARNING )) {
            Object[] parameters = null ;
            doLog( Level.WARNING, "IOR.adapterIdNotAvailable",
                parameters, IORSystemException.class, exc ) ;
        }
        
        return exc ;
    }
    
    public BAD_OPERATION adapterIdNotAvailable( CompletionStatus cs ) {
        return adapterIdNotAvailable( cs, null  ) ;
    }
    
    public BAD_OPERATION adapterIdNotAvailable( Throwable t ) {
        return adapterIdNotAvailable( CompletionStatus.COMPLETED_NO, t  ) ;
    }
    
    public BAD_OPERATION adapterIdNotAvailable(  ) {
        return adapterIdNotAvailable( CompletionStatus.COMPLETED_NO, null  ) ;
    }
    
    public static final int SERVER_ID_NOT_AVAILABLE = SUNVMCID.value + 1202 ;
    
    public BAD_OPERATION serverIdNotAvailable( CompletionStatus cs, Throwable t ) {
        BAD_OPERATION exc = new BAD_OPERATION( SERVER_ID_NOT_AVAILABLE, cs ) ;
        if (t != null)
            exc.initCause( t ) ;
        
        if (logger.isLoggable( Level.WARNING )) {
            Object[] parameters = null ;
            doLog( Level.WARNING, "IOR.serverIdNotAvailable",
                parameters, IORSystemException.class, exc ) ;
        }
        
        return exc ;
    }
    
    public BAD_OPERATION serverIdNotAvailable( CompletionStatus cs ) {
        return serverIdNotAvailable( cs, null  ) ;
    }
    
    public BAD_OPERATION serverIdNotAvailable( Throwable t ) {
        return serverIdNotAvailable( CompletionStatus.COMPLETED_NO, t  ) ;
    }
    
    public BAD_OPERATION serverIdNotAvailable(  ) {
        return serverIdNotAvailable( CompletionStatus.COMPLETED_NO, null  ) ;
    }
    
    public static final int ORB_ID_NOT_AVAILABLE = SUNVMCID.value + 1203 ;
    
    public BAD_OPERATION orbIdNotAvailable( CompletionStatus cs, Throwable t ) {
        BAD_OPERATION exc = new BAD_OPERATION( ORB_ID_NOT_AVAILABLE, cs ) ;
        if (t != null)
            exc.initCause( t ) ;
        
        if (logger.isLoggable( Level.WARNING )) {
            Object[] parameters = null ;
            doLog( Level.WARNING, "IOR.orbIdNotAvailable",
                parameters, IORSystemException.class, exc ) ;
        }
        
        return exc ;
    }
    
    public BAD_OPERATION orbIdNotAvailable( CompletionStatus cs ) {
        return orbIdNotAvailable( cs, null  ) ;
    }
    
    public BAD_OPERATION orbIdNotAvailable( Throwable t ) {
        return orbIdNotAvailable( CompletionStatus.COMPLETED_NO, t  ) ;
    }
    
    public BAD_OPERATION orbIdNotAvailable(  ) {
        return orbIdNotAvailable( CompletionStatus.COMPLETED_NO, null  ) ;
    }
    
    public static final int OBJECT_ADAPTER_ID_NOT_AVAILABLE = SUNVMCID.value + 1204 ;
    
    public BAD_OPERATION objectAdapterIdNotAvailable( CompletionStatus cs, Throwable t ) {
        BAD_OPERATION exc = new BAD_OPERATION( OBJECT_ADAPTER_ID_NOT_AVAILABLE, cs ) ;
        if (t != null)
            exc.initCause( t ) ;
        
        if (logger.isLoggable( Level.WARNING )) {
            Object[] parameters = null ;
            doLog( Level.WARNING, "IOR.objectAdapterIdNotAvailable",
                parameters, IORSystemException.class, exc ) ;
        }
        
        return exc ;
    }
    
    public BAD_OPERATION objectAdapterIdNotAvailable( CompletionStatus cs ) {
        return objectAdapterIdNotAvailable( cs, null  ) ;
    }
    
    public BAD_OPERATION objectAdapterIdNotAvailable( Throwable t ) {
        return objectAdapterIdNotAvailable( CompletionStatus.COMPLETED_NO, t  ) ;
    }
    
    public BAD_OPERATION objectAdapterIdNotAvailable(  ) {
        return objectAdapterIdNotAvailable( CompletionStatus.COMPLETED_NO, null  ) ;
    }
    
    ///////////////////////////////////////////////////////////
    // BAD_PARAM
    ///////////////////////////////////////////////////////////
    
    public static final int BAD_OID_IN_IOR_TEMPLATE_LIST = SUNVMCID.value + 1201 ;
    
    public BAD_PARAM badOidInIorTemplateList( CompletionStatus cs, Throwable t ) {
        BAD_PARAM exc = new BAD_PARAM( BAD_OID_IN_IOR_TEMPLATE_LIST, cs ) ;
        if (t != null)
            exc.initCause( t ) ;
        
        if (logger.isLoggable( Level.WARNING )) {
            Object[] parameters = null ;
            doLog( Level.WARNING, "IOR.badOidInIorTemplateList",
                parameters, IORSystemException.class, exc ) ;
        }
        
        return exc ;
    }
    
    public BAD_PARAM badOidInIorTemplateList( CompletionStatus cs ) {
        return badOidInIorTemplateList( cs, null  ) ;
    }
    
    public BAD_PARAM badOidInIorTemplateList( Throwable t ) {
        return badOidInIorTemplateList( CompletionStatus.COMPLETED_NO, t  ) ;
    }
    
    public BAD_PARAM badOidInIorTemplateList(  ) {
        return badOidInIorTemplateList( CompletionStatus.COMPLETED_NO, null  ) ;
    }
    
    public static final int INVALID_TAGGED_PROFILE = SUNVMCID.value + 1202 ;
    
    public BAD_PARAM invalidTaggedProfile( CompletionStatus cs, Throwable t ) {
        BAD_PARAM exc = new BAD_PARAM( INVALID_TAGGED_PROFILE, cs ) ;
        if (t != null)
            exc.initCause( t ) ;
        
        if (logger.isLoggable( Level.WARNING )) {
            Object[] parameters = null ;
            doLog( Level.WARNING, "IOR.invalidTaggedProfile",
                parameters, IORSystemException.class, exc ) ;
        }
        
        return exc ;
    }
    
    public BAD_PARAM invalidTaggedProfile( CompletionStatus cs ) {
        return invalidTaggedProfile( cs, null  ) ;
    }
    
    public BAD_PARAM invalidTaggedProfile( Throwable t ) {
        return invalidTaggedProfile( CompletionStatus.COMPLETED_NO, t  ) ;
    }
    
    public BAD_PARAM invalidTaggedProfile(  ) {
        return invalidTaggedProfile( CompletionStatus.COMPLETED_NO, null  ) ;
    }
    
    public static final int BAD_IIOP_ADDRESS_PORT = SUNVMCID.value + 1203 ;
    
    public BAD_PARAM badIiopAddressPort( CompletionStatus cs, Throwable t, Object arg0) {
        BAD_PARAM exc = new BAD_PARAM( BAD_IIOP_ADDRESS_PORT, cs ) ;
        if (t != null)
            exc.initCause( t ) ;
        
        if (logger.isLoggable( Level.WARNING )) {
            Object[] parameters = new Object[1] ;
            parameters[0] = arg0 ;
            doLog( Level.WARNING, "IOR.badIiopAddressPort",
                parameters, IORSystemException.class, exc ) ;
        }
        
        return exc ;
    }
    
    public BAD_PARAM badIiopAddressPort( CompletionStatus cs, Object arg0) {
        return badIiopAddressPort( cs, null, arg0 ) ;
    }
    
    public BAD_PARAM badIiopAddressPort( Throwable t, Object arg0) {
        return badIiopAddressPort( CompletionStatus.COMPLETED_NO, t, arg0 ) ;
    }
    
    public BAD_PARAM badIiopAddressPort(  Object arg0) {
        return badIiopAddressPort( CompletionStatus.COMPLETED_NO, null, arg0 ) ;
    }
    
    ///////////////////////////////////////////////////////////
    // INV_OBJREF
    ///////////////////////////////////////////////////////////
    
    public static final int IOR_MUST_HAVE_IIOP_PROFILE = SUNVMCID.value + 1201 ;
    
    public INV_OBJREF iorMustHaveIiopProfile( CompletionStatus cs, Throwable t ) {
        INV_OBJREF exc = new INV_OBJREF( IOR_MUST_HAVE_IIOP_PROFILE, cs ) ;
        if (t != null)
            exc.initCause( t ) ;
        
        if (logger.isLoggable( Level.WARNING )) {
            Object[] parameters = null ;
            doLog( Level.WARNING, "IOR.iorMustHaveIiopProfile",
                parameters, IORSystemException.class, exc ) ;
        }
        
        return exc ;
    }
    
    public INV_OBJREF iorMustHaveIiopProfile( CompletionStatus cs ) {
        return iorMustHaveIiopProfile( cs, null  ) ;
    }
    
    public INV_OBJREF iorMustHaveIiopProfile( Throwable t ) {
        return iorMustHaveIiopProfile( CompletionStatus.COMPLETED_NO, t  ) ;
    }
    
    public INV_OBJREF iorMustHaveIiopProfile(  ) {
        return iorMustHaveIiopProfile( CompletionStatus.COMPLETED_NO, null  ) ;
    }
    
    
}

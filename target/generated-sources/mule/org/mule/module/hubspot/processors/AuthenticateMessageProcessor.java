
package org.mule.module.hubspot.processors;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import org.mule.api.MuleEvent;
import org.mule.api.MuleException;
import org.mule.api.config.ConfigurationException;
import org.mule.api.devkit.ProcessAdapter;
import org.mule.api.devkit.ProcessTemplate;
import org.mule.api.lifecycle.InitialisationException;
import org.mule.api.processor.MessageProcessor;
import org.mule.api.registry.RegistrationException;
import org.mule.api.transport.PropertyScope;
import org.mule.common.DefaultResult;
import org.mule.common.FailureType;
import org.mule.common.Result;
import org.mule.common.metadata.ConnectorMetaDataEnabled;
import org.mule.common.metadata.DefaultMetaData;
import org.mule.common.metadata.DefaultMetaDataKey;
import org.mule.common.metadata.DefaultPojoMetaDataModel;
import org.mule.common.metadata.DefaultSimpleMetaDataModel;
import org.mule.common.metadata.MetaData;
import org.mule.common.metadata.MetaDataKey;
import org.mule.common.metadata.MetaDataModel;
import org.mule.common.metadata.OperationMetaDataEnabled;
import org.mule.common.metadata.datatype.DataType;
import org.mule.common.metadata.datatype.DataTypeFactory;
import org.mule.devkit.internal.metadata.fixes.STUDIO7157;
import org.mule.devkit.processor.DevkitBasedMessageProcessor;
import org.mule.module.hubspot.HubSpotConnector;
import org.mule.security.oauth.callback.ProcessCallback;


/**
 * AuthenticateMessageProcessor invokes the {@link org.mule.module.hubspot.HubSpotConnector#authenticate(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Map)} method in {@link HubSpotConnector }. For each argument there is a field in this processor to match it.  Before invoking the actual method the processor will evaluate and transform where possible to the expected argument type.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.7.2", date = "2015-12-11T05:23:24-03:00", comments = "Build 3.7.x.2633.51164b9")
public class AuthenticateMessageProcessor
    extends DevkitBasedMessageProcessor
    implements MessageProcessor, OperationMetaDataEnabled
{

    protected Object userId;
    protected String _userIdType;
    protected Object callbackUrl;
    protected String _callbackUrlType;
    protected Object clientId;
    protected String _clientIdType;
    protected Object hubId;
    protected String _hubIdType;
    protected Object scope;
    protected String _scopeType;
    protected Object headers;
    protected Map<String, Object> _headersType;

    public AuthenticateMessageProcessor(String operationName) {
        super(operationName);
    }

    /**
     * Obtains the expression manager from the Mule context and initialises the connector. If a target object  has not been set already it will search the Mule registry for a default one.
     * 
     * @throws InitialisationException
     */
    public void initialise()
        throws InitialisationException
    {
    }

    @Override
    public void start()
        throws MuleException
    {
        super.start();
    }

    @Override
    public void stop()
        throws MuleException
    {
        super.stop();
    }

    @Override
    public void dispose() {
        super.dispose();
    }

    /**
     * Sets headers
     * 
     * @param value Value to set
     */
    public void setHeaders(Object value) {
        this.headers = value;
    }

    /**
     * Sets hubId
     * 
     * @param value Value to set
     */
    public void setHubId(Object value) {
        this.hubId = value;
    }

    /**
     * Sets callbackUrl
     * 
     * @param value Value to set
     */
    public void setCallbackUrl(Object value) {
        this.callbackUrl = value;
    }

    /**
     * Sets scope
     * 
     * @param value Value to set
     */
    public void setScope(Object value) {
        this.scope = value;
    }

    /**
     * Sets userId
     * 
     * @param value Value to set
     */
    public void setUserId(Object value) {
        this.userId = value;
    }

    /**
     * Sets clientId
     * 
     * @param value Value to set
     */
    public void setClientId(Object value) {
        this.clientId = value;
    }

    /**
     * Invokes the MessageProcessor.
     * 
     * @param event MuleEvent to be processed
     * @throws Exception
     */
    public MuleEvent doProcess(final MuleEvent event)
        throws Exception
    {
        Object moduleObject = null;
        try {
            moduleObject = findOrCreate(null, false, event);
            final String _transformedUserId = ((String) evaluateAndTransform(getMuleContext(), event, AuthenticateMessageProcessor.class.getDeclaredField("_userIdType").getGenericType(), null, userId));
            final String _transformedCallbackUrl = ((String) evaluateAndTransform(getMuleContext(), event, AuthenticateMessageProcessor.class.getDeclaredField("_callbackUrlType").getGenericType(), null, callbackUrl));
            final String _transformedClientId = ((String) evaluateAndTransform(getMuleContext(), event, AuthenticateMessageProcessor.class.getDeclaredField("_clientIdType").getGenericType(), null, clientId));
            final String _transformedHubId = ((String) evaluateAndTransform(getMuleContext(), event, AuthenticateMessageProcessor.class.getDeclaredField("_hubIdType").getGenericType(), null, hubId));
            final String _transformedScope = ((String) evaluateAndTransform(getMuleContext(), event, AuthenticateMessageProcessor.class.getDeclaredField("_scopeType").getGenericType(), null, scope));
            final HashMap<String, Object> _transformedHeaders = new HashMap<String, Object>();
            Object resultPayload;
            final ProcessTemplate<Object, Object> processTemplate = ((ProcessAdapter<Object> ) moduleObject).getProcessTemplate();
            resultPayload = processTemplate.execute(new ProcessCallback<Object,Object>() {


                public List<Class<? extends Exception>> getManagedExceptions() {
                    return null;
                }

                public boolean isProtected() {
                    return false;
                }

                public Object process(Object object)
                    throws Exception
                {
                    return ((HubSpotConnector) object).authenticate(_transformedUserId, _transformedCallbackUrl, _transformedClientId, _transformedHubId, _transformedScope, _transformedHeaders);
                }

            }
            , this, event);
            event.getMessage().setPayload(resultPayload);
            if ((_transformedHeaders!= null)&&(!_transformedHeaders.isEmpty())) {
                event.getMessage().addProperties(_transformedHeaders, PropertyScope.OUTBOUND);
            }
            return event;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public Result<MetaData> getInputMetaData() {
        return new DefaultResult<MetaData>(null, (Result.Status.SUCCESS));
    }

    @Override
    public Result<MetaData> getOutputMetaData(MetaData inputMetadata) {
        MetaDataModel metaDataPayload = getPojoOrSimpleModel(String.class);
        DefaultMetaDataKey keyForStudio = new DefaultMetaDataKey("OUTPUT_METADATA", null);
        metaDataPayload.addProperty(STUDIO7157 .getStructureIdentifierMetaDataModelProperty(keyForStudio, false, false));
        return new DefaultResult<MetaData>(new DefaultMetaData(metaDataPayload));
    }

    private MetaDataModel getPojoOrSimpleModel(Class clazz) {
        DataType dataType = DataTypeFactory.getInstance().getDataType(clazz);
        if (DataType.POJO.equals(dataType)) {
            return new DefaultPojoMetaDataModel(clazz);
        } else {
            return new DefaultSimpleMetaDataModel(dataType);
        }
    }

    public Result<MetaData> getGenericMetaData(MetaDataKey metaDataKey) {
        ConnectorMetaDataEnabled connector;
        try {
            connector = ((ConnectorMetaDataEnabled) findOrCreate(null, false, null));
            try {
                Result<MetaData> metadata = connector.getMetaData(metaDataKey);
                if ((Result.Status.FAILURE).equals(metadata.getStatus())) {
                    return metadata;
                }
                if (metadata.get() == null) {
                    return new DefaultResult<MetaData>(null, (Result.Status.FAILURE), "There was an error processing metadata at HubSpotConnector at authenticate retrieving was successful but result is null");
                }
                return metadata;
            } catch (Exception e) {
                return new DefaultResult<MetaData>(null, (Result.Status.FAILURE), e.getMessage(), FailureType.UNSPECIFIED, e);
            }
        } catch (ClassCastException cast) {
            return new DefaultResult<MetaData>(null, (Result.Status.FAILURE), "There was an error getting metadata, there was no connection manager available. Maybe you're trying to use metadata from an Oauth connector");
        } catch (ConfigurationException e) {
            return new DefaultResult<MetaData>(null, (Result.Status.FAILURE), e.getMessage(), FailureType.UNSPECIFIED, e);
        } catch (RegistrationException e) {
            return new DefaultResult<MetaData>(null, (Result.Status.FAILURE), e.getMessage(), FailureType.UNSPECIFIED, e);
        } catch (IllegalAccessException e) {
            return new DefaultResult<MetaData>(null, (Result.Status.FAILURE), e.getMessage(), FailureType.UNSPECIFIED, e);
        } catch (InstantiationException e) {
            return new DefaultResult<MetaData>(null, (Result.Status.FAILURE), e.getMessage(), FailureType.UNSPECIFIED, e);
        } catch (Exception e) {
            return new DefaultResult<MetaData>(null, (Result.Status.FAILURE), e.getMessage(), FailureType.UNSPECIFIED, e);
        }
    }

}
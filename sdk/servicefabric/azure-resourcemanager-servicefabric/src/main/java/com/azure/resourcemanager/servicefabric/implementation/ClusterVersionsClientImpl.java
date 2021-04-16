// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabric.implementation;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.servicefabric.fluent.ClusterVersionsClient;
import com.azure.resourcemanager.servicefabric.fluent.models.ClusterCodeVersionsListResultInner;
import com.azure.resourcemanager.servicefabric.models.ClusterVersionsEnvironment;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in ClusterVersionsClient. */
public final class ClusterVersionsClientImpl implements ClusterVersionsClient {
    private final ClientLogger logger = new ClientLogger(ClusterVersionsClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final ClusterVersionsService service;

    /** The service client containing this operation class. */
    private final ServiceFabricManagementClientImpl client;

    /**
     * Initializes an instance of ClusterVersionsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    ClusterVersionsClientImpl(ServiceFabricManagementClientImpl client) {
        this.service =
            RestProxy.create(ClusterVersionsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for ServiceFabricManagementClientClusterVersions to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "ServiceFabricManagem")
    private interface ClusterVersionsService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/providers/Microsoft.ServiceFabric/locations/{location}/clusterVersions"
                + "/{clusterVersion}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ClusterCodeVersionsListResultInner>> get(
            @HostParam("$host") String endpoint,
            @PathParam("location") String location,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("clusterVersion") String clusterVersion,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/providers/Microsoft.ServiceFabric/locations/{location}/environments"
                + "/{environment}/clusterVersions/{clusterVersion}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ClusterCodeVersionsListResultInner>> getByEnvironment(
            @HostParam("$host") String endpoint,
            @PathParam("location") String location,
            @PathParam("environment") ClusterVersionsEnvironment environment,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("clusterVersion") String clusterVersion,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("/subscriptions/{subscriptionId}/providers/Microsoft.ServiceFabric/locations/{location}/clusterVersions")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ClusterCodeVersionsListResultInner>> list(
            @HostParam("$host") String endpoint,
            @PathParam("location") String location,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/providers/Microsoft.ServiceFabric/locations/{location}/environments"
                + "/{environment}/clusterVersions")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ClusterCodeVersionsListResultInner>> listByEnvironment(
            @HostParam("$host") String endpoint,
            @PathParam("location") String location,
            @PathParam("environment") ClusterVersionsEnvironment environment,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Gets information about an available Service Fabric cluster code version.
     *
     * @param location The location for the cluster code versions. This is different from cluster location.
     * @param clusterVersion The cluster code version.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about an available Service Fabric cluster code version.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ClusterCodeVersionsListResultInner>> getWithResponseAsync(
        String location, String clusterVersion) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (location == null) {
            return Mono.error(new IllegalArgumentException("Parameter location is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (clusterVersion == null) {
            return Mono.error(new IllegalArgumentException("Parameter clusterVersion is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getEndpoint(),
                            location,
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            clusterVersion,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Gets information about an available Service Fabric cluster code version.
     *
     * @param location The location for the cluster code versions. This is different from cluster location.
     * @param clusterVersion The cluster code version.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about an available Service Fabric cluster code version.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ClusterCodeVersionsListResultInner>> getWithResponseAsync(
        String location, String clusterVersion, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (location == null) {
            return Mono.error(new IllegalArgumentException("Parameter location is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (clusterVersion == null) {
            return Mono.error(new IllegalArgumentException("Parameter clusterVersion is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .get(
                this.client.getEndpoint(),
                location,
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                clusterVersion,
                accept,
                context);
    }

    /**
     * Gets information about an available Service Fabric cluster code version.
     *
     * @param location The location for the cluster code versions. This is different from cluster location.
     * @param clusterVersion The cluster code version.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about an available Service Fabric cluster code version.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<ClusterCodeVersionsListResultInner> getAsync(String location, String clusterVersion) {
        return getWithResponseAsync(location, clusterVersion)
            .flatMap(
                (Response<ClusterCodeVersionsListResultInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Gets information about an available Service Fabric cluster code version.
     *
     * @param location The location for the cluster code versions. This is different from cluster location.
     * @param clusterVersion The cluster code version.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about an available Service Fabric cluster code version.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ClusterCodeVersionsListResultInner get(String location, String clusterVersion) {
        return getAsync(location, clusterVersion).block();
    }

    /**
     * Gets information about an available Service Fabric cluster code version.
     *
     * @param location The location for the cluster code versions. This is different from cluster location.
     * @param clusterVersion The cluster code version.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about an available Service Fabric cluster code version.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ClusterCodeVersionsListResultInner> getWithResponse(
        String location, String clusterVersion, Context context) {
        return getWithResponseAsync(location, clusterVersion, context).block();
    }

    /**
     * Gets information about an available Service Fabric cluster code version by environment.
     *
     * @param location The location for the cluster code versions. This is different from cluster location.
     * @param environment The operating system of the cluster. The default means all.
     * @param clusterVersion The cluster code version.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about an available Service Fabric cluster code version by environment.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ClusterCodeVersionsListResultInner>> getByEnvironmentWithResponseAsync(
        String location, ClusterVersionsEnvironment environment, String clusterVersion) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (location == null) {
            return Mono.error(new IllegalArgumentException("Parameter location is required and cannot be null."));
        }
        if (environment == null) {
            return Mono.error(new IllegalArgumentException("Parameter environment is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (clusterVersion == null) {
            return Mono.error(new IllegalArgumentException("Parameter clusterVersion is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .getByEnvironment(
                            this.client.getEndpoint(),
                            location,
                            environment,
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            clusterVersion,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Gets information about an available Service Fabric cluster code version by environment.
     *
     * @param location The location for the cluster code versions. This is different from cluster location.
     * @param environment The operating system of the cluster. The default means all.
     * @param clusterVersion The cluster code version.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about an available Service Fabric cluster code version by environment.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ClusterCodeVersionsListResultInner>> getByEnvironmentWithResponseAsync(
        String location, ClusterVersionsEnvironment environment, String clusterVersion, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (location == null) {
            return Mono.error(new IllegalArgumentException("Parameter location is required and cannot be null."));
        }
        if (environment == null) {
            return Mono.error(new IllegalArgumentException("Parameter environment is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (clusterVersion == null) {
            return Mono.error(new IllegalArgumentException("Parameter clusterVersion is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .getByEnvironment(
                this.client.getEndpoint(),
                location,
                environment,
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                clusterVersion,
                accept,
                context);
    }

    /**
     * Gets information about an available Service Fabric cluster code version by environment.
     *
     * @param location The location for the cluster code versions. This is different from cluster location.
     * @param environment The operating system of the cluster. The default means all.
     * @param clusterVersion The cluster code version.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about an available Service Fabric cluster code version by environment.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<ClusterCodeVersionsListResultInner> getByEnvironmentAsync(
        String location, ClusterVersionsEnvironment environment, String clusterVersion) {
        return getByEnvironmentWithResponseAsync(location, environment, clusterVersion)
            .flatMap(
                (Response<ClusterCodeVersionsListResultInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Gets information about an available Service Fabric cluster code version by environment.
     *
     * @param location The location for the cluster code versions. This is different from cluster location.
     * @param environment The operating system of the cluster. The default means all.
     * @param clusterVersion The cluster code version.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about an available Service Fabric cluster code version by environment.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ClusterCodeVersionsListResultInner getByEnvironment(
        String location, ClusterVersionsEnvironment environment, String clusterVersion) {
        return getByEnvironmentAsync(location, environment, clusterVersion).block();
    }

    /**
     * Gets information about an available Service Fabric cluster code version by environment.
     *
     * @param location The location for the cluster code versions. This is different from cluster location.
     * @param environment The operating system of the cluster. The default means all.
     * @param clusterVersion The cluster code version.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about an available Service Fabric cluster code version by environment.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ClusterCodeVersionsListResultInner> getByEnvironmentWithResponse(
        String location, ClusterVersionsEnvironment environment, String clusterVersion, Context context) {
        return getByEnvironmentWithResponseAsync(location, environment, clusterVersion, context).block();
    }

    /**
     * Gets all available code versions for Service Fabric cluster resources by location.
     *
     * @param location The location for the cluster code versions. This is different from cluster location.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all available code versions for Service Fabric cluster resources by location.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ClusterCodeVersionsListResultInner>> listWithResponseAsync(String location) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (location == null) {
            return Mono.error(new IllegalArgumentException("Parameter location is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .list(
                            this.client.getEndpoint(),
                            location,
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Gets all available code versions for Service Fabric cluster resources by location.
     *
     * @param location The location for the cluster code versions. This is different from cluster location.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all available code versions for Service Fabric cluster resources by location.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ClusterCodeVersionsListResultInner>> listWithResponseAsync(String location, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (location == null) {
            return Mono.error(new IllegalArgumentException("Parameter location is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .list(
                this.client.getEndpoint(),
                location,
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                accept,
                context);
    }

    /**
     * Gets all available code versions for Service Fabric cluster resources by location.
     *
     * @param location The location for the cluster code versions. This is different from cluster location.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all available code versions for Service Fabric cluster resources by location.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<ClusterCodeVersionsListResultInner> listAsync(String location) {
        return listWithResponseAsync(location)
            .flatMap(
                (Response<ClusterCodeVersionsListResultInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Gets all available code versions for Service Fabric cluster resources by location.
     *
     * @param location The location for the cluster code versions. This is different from cluster location.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all available code versions for Service Fabric cluster resources by location.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ClusterCodeVersionsListResultInner list(String location) {
        return listAsync(location).block();
    }

    /**
     * Gets all available code versions for Service Fabric cluster resources by location.
     *
     * @param location The location for the cluster code versions. This is different from cluster location.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all available code versions for Service Fabric cluster resources by location.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ClusterCodeVersionsListResultInner> listWithResponse(String location, Context context) {
        return listWithResponseAsync(location, context).block();
    }

    /**
     * Gets all available code versions for Service Fabric cluster resources by environment.
     *
     * @param location The location for the cluster code versions. This is different from cluster location.
     * @param environment The operating system of the cluster. The default means all.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all available code versions for Service Fabric cluster resources by environment.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ClusterCodeVersionsListResultInner>> listByEnvironmentWithResponseAsync(
        String location, ClusterVersionsEnvironment environment) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (location == null) {
            return Mono.error(new IllegalArgumentException("Parameter location is required and cannot be null."));
        }
        if (environment == null) {
            return Mono.error(new IllegalArgumentException("Parameter environment is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .listByEnvironment(
                            this.client.getEndpoint(),
                            location,
                            environment,
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Gets all available code versions for Service Fabric cluster resources by environment.
     *
     * @param location The location for the cluster code versions. This is different from cluster location.
     * @param environment The operating system of the cluster. The default means all.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all available code versions for Service Fabric cluster resources by environment.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ClusterCodeVersionsListResultInner>> listByEnvironmentWithResponseAsync(
        String location, ClusterVersionsEnvironment environment, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (location == null) {
            return Mono.error(new IllegalArgumentException("Parameter location is required and cannot be null."));
        }
        if (environment == null) {
            return Mono.error(new IllegalArgumentException("Parameter environment is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .listByEnvironment(
                this.client.getEndpoint(),
                location,
                environment,
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                accept,
                context);
    }

    /**
     * Gets all available code versions for Service Fabric cluster resources by environment.
     *
     * @param location The location for the cluster code versions. This is different from cluster location.
     * @param environment The operating system of the cluster. The default means all.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all available code versions for Service Fabric cluster resources by environment.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<ClusterCodeVersionsListResultInner> listByEnvironmentAsync(
        String location, ClusterVersionsEnvironment environment) {
        return listByEnvironmentWithResponseAsync(location, environment)
            .flatMap(
                (Response<ClusterCodeVersionsListResultInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Gets all available code versions for Service Fabric cluster resources by environment.
     *
     * @param location The location for the cluster code versions. This is different from cluster location.
     * @param environment The operating system of the cluster. The default means all.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all available code versions for Service Fabric cluster resources by environment.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ClusterCodeVersionsListResultInner listByEnvironment(
        String location, ClusterVersionsEnvironment environment) {
        return listByEnvironmentAsync(location, environment).block();
    }

    /**
     * Gets all available code versions for Service Fabric cluster resources by environment.
     *
     * @param location The location for the cluster code versions. This is different from cluster location.
     * @param environment The operating system of the cluster. The default means all.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all available code versions for Service Fabric cluster resources by environment.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ClusterCodeVersionsListResultInner> listByEnvironmentWithResponse(
        String location, ClusterVersionsEnvironment environment, Context context) {
        return listByEnvironmentWithResponseAsync(location, environment, context).block();
    }
}
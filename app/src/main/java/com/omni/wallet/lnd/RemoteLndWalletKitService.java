package com.omni.wallet.lnd;

import io.grpc.CallCredentials;
import io.grpc.Channel;
import io.reactivex.rxjava3.core.Single;
import walletrpc.WalletKitGrpc;

public class RemoteLndWalletKitService implements LndWalletKitService {

    private final WalletKitGrpc.WalletKitStub asyncStub;

    public RemoteLndWalletKitService(Channel channel, CallCredentials callCredentials) {
        asyncStub = WalletKitGrpc.newStub(channel).withCallCredentials(callCredentials);
    }

    @Override
    public Single<walletrpc.Walletkit.ListUnspentResponse> listUnspent(walletrpc.Walletkit.ListUnspentRequest request) {
        return DefaultSingle.createDefault(emitter -> asyncStub.listUnspent(request, new RemoteLndSingleObserver<>(emitter)));
    }

    @Override
    public Single<walletrpc.Walletkit.LeaseOutputResponse> leaseOutput(walletrpc.Walletkit.LeaseOutputRequest request) {
        return DefaultSingle.createDefault(emitter -> asyncStub.leaseOutput(request, new RemoteLndSingleObserver<>(emitter)));
    }

    @Override
    public Single<walletrpc.Walletkit.ReleaseOutputResponse> releaseOutput(walletrpc.Walletkit.ReleaseOutputRequest request) {
        return DefaultSingle.createDefault(emitter -> asyncStub.releaseOutput(request, new RemoteLndSingleObserver<>(emitter)));
    }

    @Override
    public Single<walletrpc.Walletkit.ListLeasesResponse> listLeases(walletrpc.Walletkit.ListLeasesRequest request) {
        return DefaultSingle.createDefault(emitter -> asyncStub.listLeases(request, new RemoteLndSingleObserver<>(emitter)));
    }

    @Override
    public Single<signrpc.SignerOuterClass.KeyDescriptor> deriveNextKey(walletrpc.Walletkit.KeyReq request) {
        return DefaultSingle.createDefault(emitter -> asyncStub.deriveNextKey(request, new RemoteLndSingleObserver<>(emitter)));
    }

    @Override
    public Single<signrpc.SignerOuterClass.KeyDescriptor> deriveKey(signrpc.SignerOuterClass.KeyLocator request) {
        return DefaultSingle.createDefault(emitter -> asyncStub.deriveKey(request, new RemoteLndSingleObserver<>(emitter)));
    }

    @Override
    public Single<walletrpc.Walletkit.AddrResponse> nextAddr(walletrpc.Walletkit.AddrRequest request) {
        return DefaultSingle.createDefault(emitter -> asyncStub.nextAddr(request, new RemoteLndSingleObserver<>(emitter)));
    }

    @Override
    public Single<walletrpc.Walletkit.ListAccountsResponse> listAccounts(walletrpc.Walletkit.ListAccountsRequest request) {
        return DefaultSingle.createDefault(emitter -> asyncStub.listAccounts(request, new RemoteLndSingleObserver<>(emitter)));
    }

    @Override
    public Single<walletrpc.Walletkit.ImportAccountResponse> importAccount(walletrpc.Walletkit.ImportAccountRequest request) {
        return DefaultSingle.createDefault(emitter -> asyncStub.importAccount(request, new RemoteLndSingleObserver<>(emitter)));
    }

    @Override
    public Single<walletrpc.Walletkit.ImportPublicKeyResponse> importPublicKey(walletrpc.Walletkit.ImportPublicKeyRequest request) {
        return DefaultSingle.createDefault(emitter -> asyncStub.importPublicKey(request, new RemoteLndSingleObserver<>(emitter)));
    }

    @Override
    public Single<walletrpc.Walletkit.PublishResponse> publishTransaction(walletrpc.Walletkit.Transaction request) {
        return DefaultSingle.createDefault(emitter -> asyncStub.publishTransaction(request, new RemoteLndSingleObserver<>(emitter)));
    }

    @Override
    public Single<walletrpc.Walletkit.SendOutputsResponse> sendOutputs(walletrpc.Walletkit.SendOutputsRequest request) {
        return DefaultSingle.createDefault(emitter -> asyncStub.sendOutputs(request, new RemoteLndSingleObserver<>(emitter)));
    }

    @Override
    public Single<walletrpc.Walletkit.EstimateFeeResponse> estimateFee(walletrpc.Walletkit.EstimateFeeRequest request) {
        return DefaultSingle.createDefault(emitter -> asyncStub.estimateFee(request, new RemoteLndSingleObserver<>(emitter)));
    }

    @Override
    public Single<walletrpc.Walletkit.PendingSweepsResponse> pendingSweeps(walletrpc.Walletkit.PendingSweepsRequest request) {
        return DefaultSingle.createDefault(emitter -> asyncStub.pendingSweeps(request, new RemoteLndSingleObserver<>(emitter)));
    }

    @Override
    public Single<walletrpc.Walletkit.BumpFeeResponse> bumpFee(walletrpc.Walletkit.BumpFeeRequest request) {
        return DefaultSingle.createDefault(emitter -> asyncStub.bumpFee(request, new RemoteLndSingleObserver<>(emitter)));
    }

    @Override
    public Single<walletrpc.Walletkit.ListSweepsResponse> listSweeps(walletrpc.Walletkit.ListSweepsRequest request) {
        return DefaultSingle.createDefault(emitter -> asyncStub.listSweeps(request, new RemoteLndSingleObserver<>(emitter)));
    }

    @Override
    public Single<walletrpc.Walletkit.LabelTransactionResponse> labelTransaction(walletrpc.Walletkit.LabelTransactionRequest request) {
        return DefaultSingle.createDefault(emitter -> asyncStub.labelTransaction(request, new RemoteLndSingleObserver<>(emitter)));
    }

    @Override
    public Single<walletrpc.Walletkit.FundPsbtResponse> fundPsbt(walletrpc.Walletkit.FundPsbtRequest request) {
        return DefaultSingle.createDefault(emitter -> asyncStub.fundPsbt(request, new RemoteLndSingleObserver<>(emitter)));
    }

    @Override
    public Single<walletrpc.Walletkit.FinalizePsbtResponse> finalizePsbt(walletrpc.Walletkit.FinalizePsbtRequest request) {
        return DefaultSingle.createDefault(emitter -> asyncStub.finalizePsbt(request, new RemoteLndSingleObserver<>(emitter)));
    }

}
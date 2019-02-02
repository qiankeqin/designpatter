package com.spring4all.designpattern.pattern.structural.facade;

/**
 * @author qiankeqin
 * @Description: 积分礼物兑换服务
 * @date 2019-02-02 20:52
 */
public class GiftExchangeService {

    private QualifyService qualifyService = new QualifyService();

    private PointPaymentService pointPaymentService = new PointPaymentService();

    private ShippingService shippingService = new ShippingService();


    public void giftExchange(PointsGift pointsGift){
        if(qualifyService.isAvailable(pointsGift)){
            //资格校验通过
            if(pointPaymentService.pay(pointsGift)){
                //支付成功
                //发送物流
                String shipNo = shippingService.shipGift(pointsGift);
                System.out.println("积分兑换礼物成功！礼物："+pointsGift.getName()+",物流订单号："+shipNo);
            }
        }
    }
}
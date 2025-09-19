1. Các layer trong 1 hệ thống
    Controller -> Service -> Repository (Các layer chỉ được gọi xuống các layer dưới không thể gọi nhảy cóc)
2. Mapstruct
- Giúp mapping giữa các object, dto, entity một cách tự động
3. AutoWired dùng để inject các dependency nhưng không phải là best pratice mà khuyến khích sử dụng constructor để inject các dependency này vào và lombok hỗ trợ việc đó
